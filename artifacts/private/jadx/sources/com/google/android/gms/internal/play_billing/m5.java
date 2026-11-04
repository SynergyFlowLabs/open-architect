package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.m5;
import com.google.android.gms.internal.play_billing.n5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m5<MessageType extends n5<MessageType, BuilderType>, BuilderType extends m5<MessageType, BuilderType>> implements g8 {
    private static void g(List list, int i10) {
        String str = "Element at index " + (list.size() - i10) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i10) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    protected static void i(Iterable iterable, List list) {
        byte[] bArr = j7.f109152b;
        iterable.getClass();
        int i10 = 6 >> 0;
        if (iterable instanceof s7) {
            List listA = ((s7) iterable).a();
            s7 s7Var = (s7) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (s7Var.size() - size) + " is null.";
                    int size2 = s7Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        s7Var.remove(size2);
                    }
                } else if (obj instanceof d6) {
                    s7Var.g();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    d6.r(bArr2, 0, bArr2.length);
                    s7Var.g();
                } else {
                    s7Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof o8) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof q8) {
                ((q8) list).k(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    g(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i11 = 0; i11 < size5; i11++) {
            Object obj3 = list2.get(i11);
            if (obj3 == null) {
                g(list, size4);
            }
            list.add(obj3);
        }
    }

    @Override // 
    public abstract m5 h();
}
