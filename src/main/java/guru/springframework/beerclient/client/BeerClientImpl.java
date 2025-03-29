package guru.springframework.beerclient.client;

import guru.springframework.beerclient.model.BeerDto;
import guru.springframework.beerclient.model.BeerPageList;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.util.UUID;

public class BeerClientImpl implements BeerClient {
    
    @Override
    public Mono<BeerDto> getBeerById(UUID beerId, Boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public Mono<BeerPageList> listBeers(Integer pageNumber, Integer pageSize, String beerName, String beerStyle, Boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public Mono<ResponseEntity> createBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public Mono<ResponseEntity> updateBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public Mono<ResponseEntity> deleteBeerById(UUID beerId) {
        return null;
    }

    @Override
    public Mono<BeerDto> getBeerByUpc(String upc, Boolean showInventoryOnHand) {
        return null;
    }
}
