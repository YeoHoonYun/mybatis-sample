package net.chandol.study.mybatissample.repository;
/**
 * Created by cjswo9207u@gmail.com on 2019-02-22
 * Github : https://github.com/YeoHoonYun
 */
import net.chandol.study.mybatissample.model.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CityMapper {
    City selectCityById(Long id);

    List<City> selectAllCity();

    void insertCity(City city);
}
