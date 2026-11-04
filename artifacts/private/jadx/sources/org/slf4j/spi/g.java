package org.slf4j.spi;

import java.util.Deque;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface g {
    void a(String str, String str2);

    String b(String str);

    void c(String str, String str2);

    void clear();

    Map<String, String> d();

    void e(Map<String, String> map);

    Deque<String> f(String str);

    void g(String str);

    String get(String str);

    void remove(String str);
}
