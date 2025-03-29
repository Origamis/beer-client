package guru.springframework.beerclient.client;

import guru.springframework.beerclient.configs.WebConfig;
import guru.springframework.beerclient.model.BeerPagedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import static org.assertj.core.api.Assertions.assertThat;

class BeerClientImplTest {

    BeerClient beerClient;

    @BeforeEach
    void setUp() {
        beerClient = new BeerClientImpl(new WebConfig().webClient());
    }

    @Test
    void listBeers() {
        Mono<BeerPagedList> beerPageListMono = beerClient.listBeers(null, null, null, null, null);

        var pagedList = beerPageListMono.block();

        assertThat(pagedList).isNotNull();
        assertThat(pagedList.getContent()).isNotEmpty();
        System.out.println(pagedList.toList());
    }

    @Test
    void listBeersPageSize10() {
        Mono<BeerPagedList> beerPageListMono = beerClient.listBeers(1, 10, null, null, null);

        var pagedList = beerPageListMono.block();

        assertThat(pagedList).isNotNull();
        assertThat(pagedList.getContent().size()).isEqualTo(10);
    }

    @Test
    void listBeersNoRecords() {
        Mono<BeerPagedList> beerPageListMono = beerClient.listBeers(100, 20, null, null, null);

        var pagedList = beerPageListMono.block();

        assertThat(pagedList).isNotNull();
        assertThat(pagedList.getContent().size()).isEqualTo(0);
    }
    
    @Test
    void getBeerById() {
    }

    @Test
    void createBeer() {
    }

    @Test
    void updateBeer() {
    }

    @Test
    void deleteBeerById() {
    }

    @Test
    void getBeerByUpc() {
    }
}