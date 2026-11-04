package org.slf4j.helpers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ThreadLocal<Map<String, Deque<String>>> f339680a = new ThreadLocal<>();

    public void a(String str) {
        Map<String, Deque<String>> map;
        Deque<String> deque;
        if (str == null || (map = this.f339680a.get()) == null || (deque = map.get(str)) == null) {
            return;
        }
        deque.clear();
    }

    public Deque<String> b(String str) {
        Map<String, Deque<String>> map;
        Deque<String> deque;
        if (str == null || (map = this.f339680a.get()) == null || (deque = map.get(str)) == null) {
            return null;
        }
        return new ArrayDeque(deque);
    }

    public String c(String str) {
        Map<String, Deque<String>> map;
        Deque<String> deque;
        if (str != null && (map = this.f339680a.get()) != null && (deque = map.get(str)) != null) {
            return deque.pop();
        }
        return null;
    }

    public void d(String str, String str2) {
        if (str == null) {
            return;
        }
        Map<String, Deque<String>> map = this.f339680a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f339680a.set(map);
        }
        Deque<String> arrayDeque = map.get(str);
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
        }
        arrayDeque.push(str2);
        map.put(str, arrayDeque);
    }
}
