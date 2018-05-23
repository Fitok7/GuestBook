package com.tlgservices.guestbook.converter;

public interface EntityDTOConverter<E,D> {
    D convertToDTO(E entity);
    E convertToEntity(D DTO);
}
