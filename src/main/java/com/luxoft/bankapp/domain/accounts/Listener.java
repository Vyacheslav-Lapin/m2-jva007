package com.luxoft.bankapp.domain.accounts;

@FunctionalInterface
public interface Listener<T> {
    void action(T t);
}
