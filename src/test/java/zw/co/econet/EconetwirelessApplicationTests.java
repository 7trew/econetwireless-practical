package zw.co.econet;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zw.co.econet.model.Area;
import zw.co.econet.model.Shop;
import zw.co.econet.repository.AreaRepository;
import zw.co.econet.repository.ShopRepository;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EconetwirelessApplicationTests {

    @Autowired
    AreaRepository areaRepository;
    @Autowired
    ShopRepository shopRepository;

    @BeforeClass
    public static void setup() {

    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void saveShop() {
        Shop shop = new Shop();
        shop.setShopname("ECONET WIRELESS");
        shop.setAddress("10 Silverton road Masasa");
        Area area = new Area();
        area = areaRepository.getOne(1l);
        shop.setArea(area);
        shopRepository.save(shop);

        Assert.assertNotNull(shopRepository.findById(1l));
    }
    @Test
    public void checkShopsByArea() {
        List<Shop> shops=shopRepository.findByArea_Id(1l);

        Assert.assertTrue( shops.size()>0);
    }


}
