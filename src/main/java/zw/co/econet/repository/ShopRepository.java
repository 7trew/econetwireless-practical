package zw.co.econet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import zw.co.econet.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Long> {
    List<Shop> findByArea_Id(Long id);
}