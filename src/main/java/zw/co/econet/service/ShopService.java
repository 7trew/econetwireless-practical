package zw.co.econet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

import zw.co.econet.repository.ShopRepository;
import zw.co.econet.model.Shop;


@Service
public class ShopService {
    @Autowired
    ShopRepository shopRepository;

    public List<Shop> getAllShops(){
        return  shopRepository.findAll();
    }

    public void addShop(Shop shop) {
        shopRepository.save(shop);
    }
    public void updateShop(Long id, Shop shop) {

        shopRepository.save(shop);
    }

    public void deleteUser(Long id) {

        shopRepository.deleteById(id);
    }

    public List getShopsByArea(Long id) {
      return   shopRepository.findByArea_Id(id);
    }
}
