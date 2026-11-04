package org.slf4j;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public interface h extends Serializable {
    public static final String Z2 = "*";

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final String f339615a3 = "+";

    boolean G3();

    boolean contains(String str);

    boolean equals(Object obj);

    void f4(h hVar);

    String getName();

    @Deprecated
    boolean hasChildren();

    int hashCode();

    Iterator<h> iterator();

    boolean r3(h hVar);

    boolean s2(h hVar);
}
