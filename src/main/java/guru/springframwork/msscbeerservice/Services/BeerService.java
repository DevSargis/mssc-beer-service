package guru.springframwork.msscbeerservice.Services;

import guru.springframwork.msscbeerservice.Enums.BeerStyleEnum;
import guru.springframwork.msscbeerservice.Model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerService {
    public BeerDto getBeerById(UUID id){
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Gyumry")
                .beerStyle(BeerStyleEnum.PORTER)
                .build();
    }
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl - would add a real impl to update beer
    }

    public void delete(UUID beerId) {
        log.debug("Deleting a beer " + beerId);
    }
}