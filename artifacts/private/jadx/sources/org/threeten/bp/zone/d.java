package org.threeten.bp.zone;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f340507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentNavigableMap<String, a> f340508d = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<String> f340509e = new CopyOnWriteArraySet();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f340510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f340511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final short[] f340512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicReferenceArray<Object> f340513d;

        a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f340513d = atomicReferenceArray;
            this.f340510a = str;
            this.f340511b = strArr;
            this.f340512c = sArr;
        }

        g b(short s10) throws Exception {
            Object objA = this.f340513d.get(s10);
            if (objA instanceof byte[]) {
                objA = org.threeten.bp.zone.a.a(new DataInputStream(new ByteArrayInputStream((byte[]) objA)));
                this.f340513d.set(s10, objA);
            }
            return (g) objA;
        }

        g c(String str) {
            int iBinarySearch = Arrays.binarySearch(this.f340511b, str);
            if (iBinarySearch < 0) {
                return null;
            }
            try {
                return b(this.f340512c[iBinarySearch]);
            } catch (Exception e10) {
                throw new i("Invalid binary time-zone data: TZDB:" + str + ", version: " + this.f340510a, e10);
            }
        }

        public String toString() {
            return this.f340510a;
        }
    }

    public d() {
        if (!m(k.class.getClassLoader())) {
            throw new i("No time-zone rules found for 'TZDB'");
        }
    }

    private boolean l(InputStream inputStream) throws IOException {
        boolean z10 = false;
        for (a aVar : o(inputStream)) {
            a aVarPutIfAbsent = this.f340508d.putIfAbsent(aVar.f340510a, aVar);
            if (aVarPutIfAbsent != null && !aVarPutIfAbsent.f340510a.equals(aVar.f340510a)) {
                throw new i("Data already loaded for TZDB time-zone rules version: " + aVar.f340510a);
            }
            z10 = true;
        }
        return z10;
    }

    private boolean m(ClassLoader classLoader) {
        URL url = null;
        try {
            Enumeration<URL> resources = classLoader.getResources("org/threeten/bp/TZDB.dat");
            boolean zN = false;
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    zN |= n(urlNextElement);
                    url = urlNextElement;
                } catch (Exception e10) {
                    e = e10;
                    url = urlNextElement;
                    throw new i("Unable to load TZDB time-zone rules: " + url, e);
                }
            }
            return zN;
        } catch (Exception e11) {
            e = e11;
        }
    }

    private boolean n(URL url) throws Throwable {
        InputStream inputStreamOpenStream;
        if (!this.f340509e.add(url.toExternalForm())) {
            return false;
        }
        try {
            inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
            try {
                boolean zL = l(inputStreamOpenStream);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
                return zL;
            } catch (Throwable th2) {
                th = th2;
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenStream = null;
        }
    }

    private Iterable<a> o(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new StreamCorruptedException("File format not recognised");
        }
        int i10 = dataInputStream.readShort();
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = dataInputStream.readUTF();
        }
        int i12 = dataInputStream.readShort();
        String[] strArr2 = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            strArr2[i13] = dataInputStream.readUTF();
        }
        this.f340507c = Arrays.asList(strArr2);
        int i14 = dataInputStream.readShort();
        Object[] objArr = new Object[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i15] = bArr;
        }
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
        HashSet hashSet = new HashSet(i10);
        for (int i16 = 0; i16 < i10; i16++) {
            int i17 = dataInputStream.readShort();
            String[] strArr3 = new String[i17];
            short[] sArr = new short[i17];
            for (int i18 = 0; i18 < i17; i18++) {
                strArr3[i18] = strArr2[dataInputStream.readShort()];
                sArr[i18] = dataInputStream.readShort();
            }
            hashSet.add(new a(strArr[i16], strArr3, sArr, atomicReferenceArray));
        }
        return hashSet;
    }

    @Override // org.threeten.bp.zone.k
    protected g f(String str, boolean z10) {
        cn.d.j(str, "zoneId");
        g gVarC = this.f340508d.lastEntry().getValue().c(str);
        if (gVarC != null) {
            return gVarC;
        }
        throw new i("Unknown time-zone ID: " + str);
    }

    @Override // org.threeten.bp.zone.k
    protected NavigableMap<String, g> g(String str) {
        TreeMap treeMap = new TreeMap();
        for (a aVar : this.f340508d.values()) {
            g gVarC = aVar.c(str);
            if (gVarC != null) {
                treeMap.put(aVar.f340510a, gVarC);
            }
        }
        return treeMap;
    }

    @Override // org.threeten.bp.zone.k
    protected Set<String> h() {
        return new HashSet(this.f340507c);
    }

    public String toString() {
        return "TZDB";
    }

    public d(URL url) {
        try {
            if (n(url)) {
                return;
            }
            throw new i("No time-zone rules found: " + url);
        } catch (Exception e10) {
            throw new i("Unable to load TZDB time-zone rules: " + url, e10);
        }
    }

    public d(InputStream inputStream) {
        try {
            l(inputStream);
        } catch (Exception e10) {
            throw new i("Unable to load TZDB time-zone rules", e10);
        }
    }
}
