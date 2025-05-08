package core.basesyntax.service.operationhandler;

import static core.basesyntax.db.ShopDataBase.shopData;

import core.basesyntax.service.FruitTransaction;

public class ReturnOperation implements OperationHandler {
    @Override
    public void process(FruitTransaction fruitTransaction) {
        int oldQuantity = shopData.get(fruitTransaction.getFruit());
        shopData.put(fruitTransaction.getFruit(), fruitTransaction.getQuantity() + oldQuantity);
    }
}
