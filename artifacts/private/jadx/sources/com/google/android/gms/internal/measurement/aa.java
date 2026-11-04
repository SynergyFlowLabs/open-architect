package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.ba;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class aa<MessageType extends ba<MessageType, BuilderType>, BuilderType extends aa<MessageType, BuilderType>> implements xc {
    private static void g(List list, int i10) {
        int size = list.size() - i10;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String string = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    protected static void k(Iterable iterable, List list) {
        byte[] bArr = ac.f108281b;
        iterable.getClass();
        if (iterable instanceof ic) {
            List listA = ((ic) iterable).a();
            ic icVar = (ic) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    int size2 = icVar.size() - size;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb2.append("Element at index ");
                    sb2.append(size2);
                    sb2.append(" is null.");
                    String string = sb2.toString();
                    int size3 = icVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        icVar.remove(size3);
                    }
                } else if (obj instanceof ra) {
                    icVar.g();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    ra.n(bArr2, 0, bArr2.length);
                    icVar.g();
                } else {
                    icVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof fd) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof hd) {
                ((hd) list).k(list.size() + size4);
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    g(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj3 = list2.get(i10);
            if (obj3 == null) {
                g(list, size5);
            }
            list.add(obj3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.xc
    public final /* synthetic */ xc Hc(byte[] bArr, bb bbVar) throws cc {
        return j(bArr, 0, bArr.length, bbVar);
    }

    @Override // com.google.android.gms.internal.measurement.xc
    public final /* synthetic */ xc Lg(byte[] bArr) throws cc {
        return i(bArr, 0, bArr.length);
    }

    @Override // 
    public abstract aa h();

    public aa i(byte[] bArr, int i10, int i11) throws cc {
        throw null;
    }

    public aa j(byte[] bArr, int i10, int i11, bb bbVar) throws cc {
        throw null;
    }
}
