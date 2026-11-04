package com.google.gson;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface d {
    default List<String> b(Field field) {
        return Collections.EMPTY_LIST;
    }

    String c(Field field);
}
