package com.rabbitmq.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;

/* JADX INFO: loaded from: classes13.dex */
public class e0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f265048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f265049b;

    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f265050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f265051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f265052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f265053d;

        public a(int i10, int i11, int i12, String str) {
            this.f265050a = i10;
            this.f265051b = i11;
            this.f265052c = i12;
            int iLastIndexOf = str.lastIndexOf(".");
            if (iLastIndexOf > 0) {
                this.f265053d = str.substring(0, iLastIndexOf);
            } else {
                this.f265053d = str;
            }
        }

        public static a c(String str) {
            String[] strArrSplit = str.split(" ");
            return new a(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), strArrSplit[3]);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            if (this.f265050a < aVar.n()) {
                return -1;
            }
            return this.f265050a == aVar.n() ? 0 : 1;
        }

        public String k() {
            return this.f265053d;
        }

        public int l() {
            return this.f265052c;
        }

        public int n() {
            return this.f265050a;
        }

        public int o() {
            return this.f265051b;
        }
    }

    public e0(String str) {
        this(str, "dns:");
    }

    @Override // com.rabbitmq.client.c
    public List<b> a() throws IOException {
        List<a> listD = d(b(this.f265048a, this.f265049b));
        ArrayList arrayList = new ArrayList();
        for (a aVar : listD) {
            arrayList.add(new b(aVar.k(), aVar.l()));
        }
        return arrayList;
    }

    protected List<a> b(String str, String str2) throws IOException {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
        hashtable.put("java.naming.provider.url", str2);
        ArrayList arrayList = new ArrayList();
        try {
            NamingEnumeration all = new InitialDirContext(hashtable).getAttributes(str, new String[]{"SRV"}).get("srv").getAll();
            while (all.hasMore()) {
                arrayList.add(c((String) all.next()));
            }
            return arrayList;
        } catch (NamingException e10) {
            throw new IOException("Error during DNS SRV query", e10);
        }
    }

    protected a c(String str) {
        return a.c(str);
    }

    protected List<a> d(List<a> list) {
        Collections.sort(list);
        return list;
    }

    public e0(String str, String str2) {
        this.f265048a = str;
        this.f265049b = str2;
    }
}
