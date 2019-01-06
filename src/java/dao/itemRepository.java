package dao;

import dao.entity.items;

import java.util.List;

public interface itemRepository {
    long create(items items);
    void update(items items);
    items getOne(long id);
    List<items> findAll();
}
