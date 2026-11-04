package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final short f111959a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final short f111960b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final short f111961c = 512;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final short f111962d = 513;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final short f111963e = 514;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f111964f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f111965g = 127;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f111966h = "color";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static byte f111967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final d f111968j = new d(1, "android");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Comparator<b> f111969k = new a();

    class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.f111972c - bVar2.f111972c;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f111970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte f111971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final short f111972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f111973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.l
        private final int f111974e;

        b(int i10, String str, int i11) {
            this.f111973d = str;
            this.f111974e = i11;
            this.f111972c = (short) (65535 & i10);
            this.f111971b = (byte) ((i10 >> 16) & 255);
            this.f111970a = (byte) ((i10 >> 24) & 255);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final short f111975f = 288;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f111976g = 128;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f111977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f111978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h f111979c = new h(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f111980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final k f111981e;

        c(d dVar, List<b> list) {
            this.f111978b = dVar;
            String[] strArr = new String[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                strArr[i10] = list.get(i10).f111973d;
            }
            this.f111980d = new h(true, strArr);
            this.f111981e = new k(list);
            this.f111977a = new e(m.f111961c, f111975f, a());
        }

        int a() {
            return this.f111979c.a() + 288 + this.f111980d.a() + this.f111981e.b();
        }

        void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f111977a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(m.j(this.f111978b.f111982a));
            char[] charArray = this.f111978b.f111983b.toCharArray();
            int i10 = 4 ^ 0;
            for (int i11 = 0; i11 < 128; i11++) {
                if (i11 < charArray.length) {
                    byteArrayOutputStream.write(m.h(charArray[i11]));
                } else {
                    byteArrayOutputStream.write(m.h((char) 0));
                }
            }
            byteArrayOutputStream.write(m.j(288));
            byteArrayOutputStream.write(m.j(0));
            byteArrayOutputStream.write(m.j(this.f111979c.a() + 288));
            byteArrayOutputStream.write(m.j(0));
            byteArrayOutputStream.write(m.j(0));
            this.f111979c.c(byteArrayOutputStream);
            this.f111980d.c(byteArrayOutputStream);
            this.f111981e.c(byteArrayOutputStream);
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f111982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f111983b;

        d(int i10, String str) {
            this.f111982a = i10;
            this.f111983b = str;
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short f111984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final short f111985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f111986c;

        e(short s10, short s11, int i10) {
            this.f111984a = s10;
            this.f111985b = s11;
            this.f111986c = i10;
        }

        void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(m.k(this.f111984a));
            byteArrayOutputStream.write(m.k(this.f111985b));
            byteArrayOutputStream.write(m.j(this.f111986c));
        }
    }

    private static class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final short f111987c = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final short f111988d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final short f111989e = 8;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte f111990f = 28;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f111991g = 16;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f111992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f111993b;

        f(int i10, @androidx.annotation.l int i11) {
            this.f111992a = i10;
            this.f111993b = i11;
        }

        void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(m.k((short) 8));
            byteArrayOutputStream.write(m.k((short) 2));
            byteArrayOutputStream.write(m.j(this.f111992a));
            byteArrayOutputStream.write(m.k((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(m.j(this.f111993b));
        }
    }

    private static class g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final short f111994e = 12;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f111995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f111996b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<c> f111998d = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h f111997c = new h(new String[0]);

        g(Map<d, List<b>> map) {
            this.f111996b = map.size();
            for (Map.Entry<d, List<b>> entry : map.entrySet()) {
                List<b> value = entry.getValue();
                Collections.sort(value, m.f111969k);
                this.f111998d.add(new c(entry.getKey(), value));
            }
            this.f111995a = new e((short) 2, (short) 12, a());
        }

        private int a() {
            Iterator<c> it = this.f111998d.iterator();
            int iA = 0;
            while (it.hasNext()) {
                iA += it.next().a();
            }
            return this.f111997c.a() + 12 + iA;
        }

        void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f111995a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(m.j(this.f111996b));
            this.f111997c.c(byteArrayOutputStream);
            Iterator<c> it = this.f111998d.iterator();
            while (it.hasNext()) {
                it.next().b(byteArrayOutputStream);
            }
        }
    }

    private static class h {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final short f111999m = 28;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f112000n = 256;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f112001o = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f112002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f112003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f112004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f112005d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f112006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<Integer> f112007f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List<Integer> f112008g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List<byte[]> f112009h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final List<List<i>> f112010i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f112011j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f112012k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f112013l;

        h(String... strArr) {
            this(false, strArr);
        }

        private Pair<byte[], List<i>> b(String str) {
            return new Pair<>(this.f112011j ? m.m(str) : m.l(str), Collections.EMPTY_LIST);
        }

        int a() {
            return this.f112013l;
        }

        void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f112002a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(m.j(this.f112003b));
            byteArrayOutputStream.write(m.j(this.f112004c));
            byteArrayOutputStream.write(m.j(this.f112011j ? 256 : 0));
            byteArrayOutputStream.write(m.j(this.f112005d));
            byteArrayOutputStream.write(m.j(this.f112006e));
            Iterator<Integer> it = this.f112007f.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(m.j(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.f112008g.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(m.j(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.f112009h.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i10 = this.f112012k;
            if (i10 > 0) {
                byteArrayOutputStream.write(new byte[i10]);
            }
            Iterator<List<i>> it4 = this.f112010i.iterator();
            while (it4.hasNext()) {
                Iterator<i> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(m.j(-1));
            }
        }

        h(boolean z10, String... strArr) {
            this.f112007f = new ArrayList();
            this.f112008g = new ArrayList();
            this.f112009h = new ArrayList();
            this.f112010i = new ArrayList();
            this.f112011j = z10;
            int length = 0;
            for (String str : strArr) {
                Pair<byte[], List<i>> pairB = b(str);
                this.f112007f.add(Integer.valueOf(length));
                Object obj = pairB.first;
                length += ((byte[]) obj).length;
                this.f112009h.add((byte[]) obj);
                this.f112010i.add((List) pairB.second);
            }
            int size = 0;
            for (List<i> list : this.f112010i) {
                for (i iVar : list) {
                    this.f112007f.add(Integer.valueOf(length));
                    length += iVar.f112014a.length;
                    this.f112009h.add(iVar.f112014a);
                }
                this.f112008g.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i10 = length % 4;
            int i11 = i10 == 0 ? 0 : 4 - i10;
            this.f112012k = i11;
            int size2 = this.f112009h.size();
            this.f112003b = size2;
            this.f112004c = this.f112009h.size() - strArr.length;
            boolean z11 = this.f112009h.size() - strArr.length > 0;
            if (!z11) {
                this.f112008g.clear();
                this.f112010i.clear();
            }
            int size3 = (size2 * 4) + 28 + (this.f112008g.size() * 4);
            this.f112005d = size3;
            int i12 = length + i11;
            this.f112006e = z11 ? size3 + i12 : 0;
            int i13 = size3 + i12 + (z11 ? size : 0);
            this.f112013l = i13;
            this.f112002a = new e((short) 1, f111999m, i13);
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f112014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f112015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f112016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f112017d;

        private i() {
        }

        void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(m.j(this.f112015b));
            byteArrayOutputStream.write(m.j(this.f112016c));
            byteArrayOutputStream.write(m.j(this.f112017d));
        }
    }

    private static class j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f112018f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final short f112019g = 84;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final byte f112020h = 64;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f112021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f112022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f112023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f112024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final f[] f112025e;

        j(List<b> list, Set<Short> set, int i10) {
            byte[] bArr = new byte[64];
            this.f112023c = bArr;
            this.f112022b = i10;
            bArr[0] = 64;
            this.f112025e = new f[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f112025e[i11] = new f(i11, list.get(i11).f111974e);
            }
            this.f112024d = new int[i10];
            int i12 = 0;
            for (short s10 = 0; s10 < i10; s10 = (short) (s10 + 1)) {
                if (set.contains(Short.valueOf(s10))) {
                    this.f112024d[s10] = i12;
                    i12 += 16;
                } else {
                    this.f112024d[s10] = -1;
                }
            }
            this.f112021a = new e(m.f111962d, f112019g, a());
        }

        private int b() {
            return c() + 84;
        }

        private int c() {
            return this.f112024d.length * 4;
        }

        int a() {
            return b() + (this.f112025e.length * 16);
        }

        void d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f112021a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{m.f111967i, 0, 0, 0});
            byteArrayOutputStream.write(m.j(this.f112022b));
            byteArrayOutputStream.write(m.j(b()));
            byteArrayOutputStream.write(this.f112023c);
            for (int i10 : this.f112024d) {
                byteArrayOutputStream.write(m.j(i10));
            }
            for (f fVar : this.f112025e) {
                fVar.a(byteArrayOutputStream);
            }
        }
    }

    private static class k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final short f112026e = 16;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f112027f = 1073741824;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f112028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f112029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f112030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j f112031d;

        k(List<b> list) {
            this.f112029b = list.get(list.size() - 1).f111972c + 1;
            HashSet hashSet = new HashSet();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().f111972c));
            }
            this.f112030c = new int[this.f112029b];
            for (short s10 = 0; s10 < this.f112029b; s10 = (short) (s10 + 1)) {
                if (hashSet.contains(Short.valueOf(s10))) {
                    this.f112030c[s10] = 1073741824;
                }
            }
            this.f112028a = new e(m.f111963e, (short) 16, a());
            this.f112031d = new j(list, hashSet, this.f112029b);
        }

        private int a() {
            return (this.f112029b * 4) + 16;
        }

        int b() {
            return a() + this.f112031d.a();
        }

        void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f112028a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{m.f111967i, 0, 0, 0});
            byteArrayOutputStream.write(m.j(this.f112029b));
            for (int i10 : this.f112030c) {
                byteArrayOutputStream.write(m.j(i10));
            }
            this.f112031d.d(byteArrayOutputStream);
        }
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] h(char c10) {
        boolean z10 = true & false;
        return new byte[]{(byte) (c10 & 255), (byte) ((c10 >> '\b') & 255)};
    }

    static byte[] i(Context context, Map<Integer, Integer> map) throws IOException {
        d dVar;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        d dVar2 = new d(127, context.getPackageName());
        HashMap map2 = new HashMap();
        b bVar = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            b bVar2 = new b(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
            if (!context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + bVar2.f111973d + ", typeId=" + Integer.toHexString(bVar2.f111971b & 255));
            }
            if (bVar2.f111970a == 1) {
                dVar = f111968j;
            } else {
                if (bVar2.f111970a != 127) {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) bVar2.f111970a));
                }
                dVar = dVar2;
            }
            if (!map2.containsKey(dVar)) {
                map2.put(dVar, new ArrayList());
            }
            ((List) map2.get(dVar)).add(bVar2);
            bVar = bVar2;
        }
        byte b10 = bVar.f111971b;
        f111967i = b10;
        if (b10 == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new g(map2).b(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] j(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] k(short s10) {
        return new byte[]{(byte) (s10 & 255), (byte) ((s10 >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] l(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] bArrK = k((short) charArray.length);
        bArr[0] = bArrK[0];
        bArr[1] = bArrK[1];
        for (int i10 = 0; i10 < charArray.length; i10++) {
            byte[] bArrH = h(charArray[i10]);
            int i11 = i10 * 2;
            bArr[i11 + 2] = bArrH[0];
            bArr[i11 + 3] = bArrH[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] m(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length;
        byte[] bArr = new byte[length2 + 3];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 + 2] = 0;
        return bArr;
    }
}
