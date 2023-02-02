package zw.co.econet.controller;

import zw.co.econet.model.Area;
import zw.co.econet.model.Shop;
import zw.co.econet.service.AreaService;
import zw.co.econet.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import zw.co.econet.dto.ShopDto;

@RestController
public class ShopController {
    @Autowired
    ShopService shopService;
    @Autowired
    AreaService areaService;
    
    
    //show all areas
    @GetMapping("/area")
    public List<Area> getAllAreas(){
        return areaService.getAllAreas();
    }

    //show all shops
    @GetMapping("/shop")
    public List<Shop> getAllShops(){
        return shopService.getAllShops();
    }

    //add a new shop under an area
    @PostMapping("/shop")
    public void addShop(@RequestBody ShopDto shopDto){
        
        Area area= new Area();
        
        area=areaService.getAreaByID(shopDto.getArea_id());
        Shop shop = new Shop();
        
        shop.setAddress(shopDto.getAddress());
        shop.setShopname(shopDto.getShopname());
        shop.setArea(area);
        
        shopService.addShop(shop);
    }

    //get all shops under an area
    @GetMapping("/shop/area/{area_id}")
    public List<Shop> getAllShopsInAnArea(@PathVariable Long area_id){
        return shopService.getShopsByArea(area_id);
    }
}
