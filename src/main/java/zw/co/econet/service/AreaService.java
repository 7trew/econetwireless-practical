package zw.co.econet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.econet.model.Area;
import zw.co.econet.repository.AreaRepository;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    AreaRepository areaRepository;

    public List<Area> getAllAreas() {
        
        return areaRepository.findAll();
    }

    public Area getAreaByID(Long area_id) {
        
        return areaRepository.getOne(area_id);
    }

    public void addArea(Area area) {
        areaRepository.save(area);
    }

    public void updateArea(Long id, Area area) {

        areaRepository.save(area);
    }

    public void deleteUser(Long id) {

        areaRepository.deleteById(id);
    }
}
