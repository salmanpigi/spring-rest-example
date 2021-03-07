package id.co.mandiri.day2.mandiriday2.services;

public interface CommonService<T, ID> {
    T findById(ID id);

}
