package guru.sfg.beer.inventory.web.brewing;

import guru.sfg.brewery.model.BeerOrderDto;

public interface AllocationService {

    /**
     * 在庫を調べ、割り当て可能数量であるかどうかを判定する
     *
     * @param beerOrderDto
     * @return 割り当て可否
     */
    Boolean allocateOrder(BeerOrderDto beerOrderDto);

    void deallocateOrder(BeerOrderDto beerOrderDto);
}
