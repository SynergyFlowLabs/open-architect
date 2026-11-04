package com.google.api.client.util;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f116067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f116068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f116069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f116070d;

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f116071a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f116072b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f116073c;

            private a() {
            }
        }

        b(String str) {
            a aVar = new a();
            this.f116068b = aVar;
            this.f116069c = aVar;
            this.f116067a = str;
        }

        private a b() {
            a aVar = new a();
            this.f116069c.f116073c = aVar;
            this.f116069c = aVar;
            return aVar;
        }

        private b c(String str, Object obj) {
            a aVarB = b();
            aVarB.f116072b = obj;
            aVarB.f116071a = (String) h0.d(str);
            return this;
        }

        public b a(String str, Object obj) {
            return c(str, obj);
        }

        public b d() {
            this.f116070d = true;
            return this;
        }

        public String toString() {
            boolean z10 = this.f116070d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f116067a);
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String str = "";
            for (a aVar = this.f116068b.f116073c; aVar != null; aVar = aVar.f116073c) {
                if (!z10 || aVar.f116072b != null) {
                    sb2.append(str);
                    String str2 = aVar.f116071a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    sb2.append(aVar.f116072b);
                    str = ", ";
                }
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            return sb2.toString();
        }
    }

    private f0() {
    }

    public static boolean a(Object obj, Object obj2) {
        return com.google.api.client.repackaged.com.google.common.base.m.a(obj, obj2);
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
