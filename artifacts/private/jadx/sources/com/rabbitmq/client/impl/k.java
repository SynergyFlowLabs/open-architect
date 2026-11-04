package com.rabbitmq.client.impl;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class k implements com.rabbitmq.client.a {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f265273a = 30;

        public static class b extends y0 implements com.rabbitmq.client.a.C1753a.b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265281b = 11;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265282a;

            public b(int i10) {
                this.f265282a = i10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 11;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 30;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265282a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.C1753a.b
            public int a() {
                return this.f265282a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.y(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265282a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f265282a == ((b) obj).f265282a;
                }
                return false;
            }

            public int hashCode() {
                return this.f265282a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "access.request-ok";
            }

            public b(z0 z0Var) throws IOException {
                this(z0Var.g());
            }
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.impl.k$a$a, reason: collision with other inner class name */
        public static class C1835a extends y0 implements com.rabbitmq.client.a.C1753a.InterfaceC1754a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f265274g = 10;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f265275a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f265276b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f265277c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f265278d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final boolean f265279e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final boolean f265280f;

            public C1835a(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'realm' must be non-null.");
                }
                this.f265275a = str;
                this.f265276b = z10;
                this.f265277c = z11;
                this.f265278d = z12;
                this.f265279e = z13;
                this.f265280f = z14;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 10;
            }

            @Override // com.rabbitmq.client.a.C1753a.InterfaceC1754a
            public boolean K() {
                return this.f265280f;
            }

            @Override // com.rabbitmq.client.a.C1753a.InterfaceC1754a
            public boolean R() {
                return this.f265279e;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 30;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(realm=");
                sb2.append(this.f265275a);
                sb2.append(", exclusive=");
                sb2.append(this.f265276b);
                sb2.append(", passive=");
                sb2.append(this.f265277c);
                sb2.append(", active=");
                sb2.append(this.f265278d);
                sb2.append(", write=");
                sb2.append(this.f265279e);
                sb2.append(", read=");
                sb2.append(this.f265280f);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.D(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.l(this.f265275a);
                a1Var.d(this.f265276b);
                a1Var.d(this.f265277c);
                a1Var.d(this.f265278d);
                a1Var.d(this.f265279e);
                a1Var.d(this.f265280f);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C1835a c1835a = (C1835a) obj;
                String str = this.f265275a;
                if (str == null ? c1835a.f265275a == null : str.equals(c1835a.f265275a)) {
                    return this.f265276b == c1835a.f265276b && this.f265277c == c1835a.f265277c && this.f265278d == c1835a.f265278d && this.f265279e == c1835a.f265279e && this.f265280f == c1835a.f265280f;
                }
                return false;
            }

            @Override // com.rabbitmq.client.a.C1753a.InterfaceC1754a
            public String getRealm() {
                return this.f265275a;
            }

            public int hashCode() {
                String str = this.f265275a;
                return ((((((((((str != null ? str.hashCode() : 0) * 31) + (this.f265276b ? 1 : 0)) * 31) + (this.f265277c ? 1 : 0)) * 31) + (this.f265278d ? 1 : 0)) * 31) + (this.f265279e ? 1 : 0)) * 31) + (this.f265280f ? 1 : 0);
            }

            @Override // com.rabbitmq.client.a.C1753a.InterfaceC1754a
            public boolean l() {
                return this.f265278d;
            }

            @Override // com.rabbitmq.client.a.C1753a.InterfaceC1754a
            public boolean o() {
                return this.f265276b;
            }

            @Override // com.rabbitmq.client.a.C1753a.InterfaceC1754a
            public boolean q() {
                return this.f265277c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "access.request";
            }

            public C1835a(z0 z0Var) throws IOException {
                this(z0Var.h(), z0Var.b(), z0Var.b(), z0Var.b(), z0Var.b(), z0Var.b());
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f265283a = 60;

        public static class m extends y0 implements com.rabbitmq.client.a.b.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265335a = 11;

            public m() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 11;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.c(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.qos-ok";
            }

            public m(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class p extends y0 implements com.rabbitmq.client.a.b.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265340a = 111;

            public p() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return f265340a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.b(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.recover-ok";
            }

            public p(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class n extends y0 implements com.rabbitmq.client.a.b.n {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265336b = 110;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f265337a;

            public n(boolean z10) {
                this.f265337a = z10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 110;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(requeue=");
                sb2.append(this.f265337a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.T(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.d(this.f265337a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.f265337a == ((n) obj).f265337a;
            }

            public int hashCode() {
                return this.f265337a ? 1 : 0;
            }

            @Override // com.rabbitmq.client.a.b.n
            public boolean j() {
                return this.f265337a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.recover";
            }

            public n(z0 z0Var) throws IOException {
                this(z0Var.b());
            }
        }

        public static class o extends y0 implements com.rabbitmq.client.a.b.o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265338b = 100;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f265339a;

            public o(boolean z10) {
                this.f265339a = z10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 100;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(requeue=");
                sb2.append(this.f265339a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.O(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.d(this.f265339a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.f265339a == ((o) obj).f265339a;
            }

            public int hashCode() {
                return this.f265339a ? 1 : 0;
            }

            @Override // com.rabbitmq.client.a.b.o
            public boolean j() {
                return this.f265339a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.recover-async";
            }

            public o(z0 z0Var) throws IOException {
                this(z0Var.b());
            }
        }

        public static class a extends y0 implements com.rabbitmq.client.a.b.InterfaceC1757a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f265284c = 80;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f265285a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f265286b;

            public a(long j10, boolean z10) {
                this.f265285a = j10;
                this.f265286b = z10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 80;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(delivery-tag=");
                sb2.append(this.f265285a);
                sb2.append(", multiple=");
                sb2.append(this.f265286b);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.c0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.f(this.f265285a);
                a1Var.d(this.f265286b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f265285a == aVar.f265285a && this.f265286b == aVar.f265286b;
            }

            public int hashCode() {
                long j10 = this.f265285a;
                return (((int) (j10 ^ (j10 >>> 32))) * 31) + (this.f265286b ? 1 : 0);
            }

            @Override // com.rabbitmq.client.a.b.InterfaceC1757a
            public long i() {
                return this.f265285a;
            }

            @Override // com.rabbitmq.client.a.b.InterfaceC1757a
            public boolean w() {
                return this.f265286b;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.ack";
            }

            public a(z0 z0Var) throws IOException {
                this(z0Var.d(), z0Var.b());
            }
        }

        public static class c extends y0 implements com.rabbitmq.client.a.b.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265290b = 31;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f265291a;

            public c(String str) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'consumerTag' must be non-null.");
                }
                this.f265291a = str;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 31;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(consumer-tag=");
                sb2.append(this.f265291a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.q(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.l(this.f265291a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    c cVar = (c) obj;
                    String str = this.f265291a;
                    return str == null ? cVar.f265291a == null : str.equals(cVar.f265291a);
                }
                return false;
            }

            @Override // com.rabbitmq.client.a.b.c
            public String h() {
                return this.f265291a;
            }

            public int hashCode() {
                String str = this.f265291a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.cancel-ok";
            }

            public c(z0 z0Var) throws IOException {
                this(z0Var.h());
            }
        }

        public static class e extends y0 implements com.rabbitmq.client.a.b.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265301b = 21;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f265302a;

            public e(String str) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'consumerTag' must be non-null.");
                }
                this.f265302a = str;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 21;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(consumer-tag=");
                sb2.append(this.f265302a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.B(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.l(this.f265302a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                e eVar = (e) obj;
                String str = this.f265302a;
                return str == null ? eVar.f265302a == null : str.equals(eVar.f265302a);
            }

            @Override // com.rabbitmq.client.a.b.e
            public String h() {
                return this.f265302a;
            }

            public int hashCode() {
                String str = this.f265302a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.consume-ok";
            }

            public e(z0 z0Var) throws IOException {
                this(z0Var.h());
            }
        }

        public static class h extends y0 implements com.rabbitmq.client.a.b.h {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265313b = 72;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f265314a;

            public h(String str) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'clusterId' must be non-null.");
                }
                this.f265314a = str;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 72;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(cluster-id=");
                sb2.append(this.f265314a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.g(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.l(this.f265314a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                h hVar = (h) obj;
                String str = this.f265314a;
                return str == null ? hVar.f265314a == null : str.equals(hVar.f265314a);
            }

            public int hashCode() {
                String str = this.f265314a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            @Override // com.rabbitmq.client.a.b.h
            public String y() {
                return this.f265314a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.get-empty";
            }

            public h(z0 z0Var) throws IOException {
                this(z0Var.h());
            }
        }

        public static class q extends y0 implements com.rabbitmq.client.a.b.q {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f265341c = 90;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f265342a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f265343b;

            public q(long j10, boolean z10) {
                this.f265342a = j10;
                this.f265343b = z10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 90;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(delivery-tag=");
                sb2.append(this.f265342a);
                sb2.append(", requeue=");
                sb2.append(this.f265343b);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.i0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.f(this.f265342a);
                a1Var.d(this.f265343b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    q qVar = (q) obj;
                    return this.f265342a == qVar.f265342a && this.f265343b == qVar.f265343b;
                }
                return false;
            }

            public int hashCode() {
                long j10 = this.f265342a;
                return (((int) (j10 ^ (j10 >>> 32))) * 31) + (this.f265343b ? 1 : 0);
            }

            @Override // com.rabbitmq.client.a.b.q
            public long i() {
                return this.f265342a;
            }

            @Override // com.rabbitmq.client.a.b.q
            public boolean j() {
                return this.f265343b;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.reject";
            }

            public q(z0 z0Var) throws IOException {
                this(z0Var.d(), z0Var.b());
            }
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.impl.k$b$b, reason: collision with other inner class name */
        public static class C1836b extends y0 implements com.rabbitmq.client.a.b.InterfaceC1759b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f265287c = 30;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f265288a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f265289b;

            public C1836b(String str, boolean z10) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'consumerTag' must be non-null.");
                }
                this.f265288a = str;
                this.f265289b = z10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 30;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(consumer-tag=");
                sb2.append(this.f265288a);
                sb2.append(", nowait=");
                sb2.append(this.f265289b);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.d(this);
            }

            @Override // com.rabbitmq.client.a.b.InterfaceC1759b
            public boolean b() {
                return this.f265289b;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.l(this.f265288a);
                a1Var.d(this.f265289b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C1836b c1836b = (C1836b) obj;
                String str = this.f265288a;
                if (str == null ? c1836b.f265288a == null : str.equals(c1836b.f265288a)) {
                    return this.f265289b == c1836b.f265289b;
                }
                return false;
            }

            @Override // com.rabbitmq.client.a.b.InterfaceC1759b
            public String h() {
                return this.f265288a;
            }

            public int hashCode() {
                String str = this.f265288a;
                return ((str != null ? str.hashCode() : 0) * 31) + (this.f265289b ? 1 : 0);
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.cancel";
            }

            public C1836b(z0 z0Var) throws IOException {
                this(z0Var.h(), z0Var.b());
            }
        }

        public static class j extends y0 implements com.rabbitmq.client.a.b.j {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f265321d = 120;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f265322a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f265323b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f265324c;

            public j(long j10, boolean z10, boolean z11) {
                this.f265322a = j10;
                this.f265323b = z10;
                this.f265324c = z11;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 120;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(delivery-tag=");
                sb2.append(this.f265322a);
                sb2.append(", multiple=");
                sb2.append(this.f265323b);
                sb2.append(", requeue=");
                sb2.append(this.f265324c);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.C(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.f(this.f265322a);
                a1Var.d(this.f265323b);
                a1Var.d(this.f265324c);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    j jVar = (j) obj;
                    return this.f265322a == jVar.f265322a && this.f265323b == jVar.f265323b && this.f265324c == jVar.f265324c;
                }
                return false;
            }

            public int hashCode() {
                long j10 = this.f265322a;
                return (((((int) (j10 ^ (j10 >>> 32))) * 31) + (this.f265323b ? 1 : 0)) * 31) + (this.f265324c ? 1 : 0);
            }

            @Override // com.rabbitmq.client.a.b.j
            public long i() {
                return this.f265322a;
            }

            @Override // com.rabbitmq.client.a.b.j
            public boolean j() {
                return this.f265324c;
            }

            @Override // com.rabbitmq.client.a.b.j
            public boolean w() {
                return this.f265323b;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.nack";
            }

            public j(z0 z0Var) throws IOException {
                this(z0Var.d(), z0Var.b(), z0Var.b());
            }
        }

        public static class l extends y0 implements com.rabbitmq.client.a.b.l {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f265331d = 10;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265332a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f265333b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f265334c;

            public l(int i10, int i11, boolean z10) {
                this.f265332a = i10;
                this.f265333b = i11;
                this.f265334c = z10;
            }

            @Override // com.rabbitmq.client.a.b.l
            public int C() {
                return this.f265333b;
            }

            @Override // com.rabbitmq.client.a.b.l
            public int D() {
                return this.f265332a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 10;
            }

            @Override // com.rabbitmq.client.a.b.l
            public boolean T() {
                return this.f265334c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(prefetch-size=");
                sb2.append(this.f265332a);
                sb2.append(", prefetch-count=");
                sb2.append(this.f265333b);
                sb2.append(", global=");
                sb2.append(this.f265334c);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.a0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.e(this.f265332a);
                a1Var.k(this.f265333b);
                a1Var.d(this.f265334c);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    l lVar = (l) obj;
                    return this.f265332a == lVar.f265332a && this.f265333b == lVar.f265333b && this.f265334c == lVar.f265334c;
                }
                return false;
            }

            public int hashCode() {
                return (((this.f265332a * 31) + this.f265333b) * 31) + (this.f265334c ? 1 : 0);
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.qos";
            }

            public l(z0 z0Var) throws IOException {
                this(z0Var.c(), z0Var.g(), z0Var.b());
            }
        }

        public static class g extends y0 implements com.rabbitmq.client.a.b.g {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f265309d = 70;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265310a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265311b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f265312c;

            public g(int i10, String str, boolean z10) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'queue' must be non-null.");
                }
                this.f265310a = i10;
                this.f265311b = str;
                this.f265312c = z10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 70;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265310a);
                sb2.append(", queue=");
                sb2.append(this.f265311b);
                sb2.append(", no-ack=");
                sb2.append(this.f265312c);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.b.g
            public int a() {
                return this.f265310a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.h0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265310a);
                a1Var.l(this.f265311b);
                a1Var.d(this.f265312c);
            }

            @Override // com.rabbitmq.client.a.b.g
            public String e() {
                return this.f265311b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                g gVar = (g) obj;
                if (this.f265310a != gVar.f265310a) {
                    return false;
                }
                String str = this.f265311b;
                if (str == null ? gVar.f265311b == null : str.equals(gVar.f265311b)) {
                    return this.f265312c == gVar.f265312c;
                }
                return false;
            }

            public int hashCode() {
                int i10 = this.f265310a * 31;
                String str = this.f265311b;
                return ((i10 + (str != null ? str.hashCode() : 0)) * 31) + (this.f265312c ? 1 : 0);
            }

            @Override // com.rabbitmq.client.a.b.g
            public boolean t() {
                return this.f265312c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.get";
            }

            public g(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.b());
            }
        }

        public static class i extends y0 implements com.rabbitmq.client.a.b.i {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f265315f = 71;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f265316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f265317b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f265318c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f265319d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final int f265320e;

            public i(long j10, boolean z10, String str, String str2, int i10) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'exchange' must be non-null.");
                }
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'routingKey' must be non-null.");
                }
                this.f265316a = j10;
                this.f265317b = z10;
                this.f265318c = str;
                this.f265319d = str2;
                this.f265320e = i10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 71;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(delivery-tag=");
                sb2.append(this.f265316a);
                sb2.append(", redelivered=");
                sb2.append(this.f265317b);
                sb2.append(", exchange=");
                sb2.append(this.f265318c);
                sb2.append(", routing-key=");
                sb2.append(this.f265319d);
                sb2.append(", message-count=");
                sb2.append(this.f265320e);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return true;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.j(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.f(this.f265316a);
                a1Var.d(this.f265317b);
                a1Var.l(this.f265318c);
                a1Var.l(this.f265319d);
                a1Var.e(this.f265320e);
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
            
                if (r8.f265319d != null) goto L32;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r8) {
                /*
                    r7 = this;
                    r6 = 3
                    r0 = 1
                    r6 = 3
                    if (r7 != r8) goto L6
                    return r0
                L6:
                    r1 = 0
                    r6 = r1
                    if (r8 == 0) goto L5e
                    java.lang.Class r2 = r7.getClass()
                    r6 = 2
                    java.lang.Class r3 = r8.getClass()
                    if (r2 == r3) goto L16
                    goto L5e
                L16:
                    com.rabbitmq.client.impl.k$b$i r8 = (com.rabbitmq.client.impl.k.b.i) r8
                    r6 = 7
                    long r2 = r7.f265316a
                    long r4 = r8.f265316a
                    int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r2 == 0) goto L23
                    r6 = 4
                    return r1
                L23:
                    boolean r2 = r7.f265317b
                    r6 = 4
                    boolean r3 = r8.f265317b
                    if (r2 == r3) goto L2b
                    return r1
                L2b:
                    r6 = 5
                    java.lang.String r2 = r7.f265318c
                    if (r2 == 0) goto L3b
                    r6 = 7
                    java.lang.String r3 = r8.f265318c
                    boolean r2 = r2.equals(r3)
                    r6 = 5
                    if (r2 != 0) goto L40
                    goto L3f
                L3b:
                    java.lang.String r2 = r8.f265318c
                    if (r2 == 0) goto L40
                L3f:
                    return r1
                L40:
                    java.lang.String r2 = r7.f265319d
                    if (r2 == 0) goto L4f
                    java.lang.String r3 = r8.f265319d
                    r6 = 0
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L55
                    r6 = 6
                    goto L54
                L4f:
                    r6 = 7
                    java.lang.String r2 = r8.f265319d
                    if (r2 == 0) goto L55
                L54:
                    return r1
                L55:
                    int r7 = r7.f265320e
                    int r8 = r8.f265320e
                    if (r7 == r8) goto L5d
                    r6 = 1
                    return r1
                L5d:
                    return r0
                L5e:
                    r6 = 7
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.b.i.equals(java.lang.Object):boolean");
            }

            @Override // com.rabbitmq.client.a.b.i
            public String f() {
                return this.f265318c;
            }

            @Override // com.rabbitmq.client.a.b.i
            public String g() {
                return this.f265319d;
            }

            public int hashCode() {
                long j10 = this.f265316a;
                int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + (this.f265317b ? 1 : 0)) * 31;
                String str = this.f265318c;
                int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f265319d;
                return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f265320e;
            }

            @Override // com.rabbitmq.client.a.b.i
            public long i() {
                return this.f265316a;
            }

            @Override // com.rabbitmq.client.a.b.i
            public int k() {
                return this.f265320e;
            }

            @Override // com.rabbitmq.client.a.b.i
            public boolean s() {
                return this.f265317b;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.get-ok";
            }

            public i(z0 z0Var) throws IOException {
                this(z0Var.d(), z0Var.b(), z0Var.h(), z0Var.h(), z0Var.c());
            }
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.impl.k$b$k, reason: collision with other inner class name */
        public static class C1837k extends y0 implements com.rabbitmq.client.a.b.k {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f265325f = 40;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265326a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265327b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f265328c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f265329d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final boolean f265330e;

            public C1837k(int i10, String str, String str2, boolean z10, boolean z11) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'exchange' must be non-null.");
                }
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'routingKey' must be non-null.");
                }
                this.f265326a = i10;
                this.f265327b = str;
                this.f265328c = str2;
                this.f265329d = z10;
                this.f265330e = z11;
            }

            @Override // com.rabbitmq.client.a.b.k
            public boolean B() {
                return this.f265329d;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265326a);
                sb2.append(", exchange=");
                sb2.append(this.f265327b);
                sb2.append(", routing-key=");
                sb2.append(this.f265328c);
                sb2.append(", mandatory=");
                sb2.append(this.f265329d);
                sb2.append(", immediate=");
                sb2.append(this.f265330e);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return true;
            }

            @Override // com.rabbitmq.client.a.b.k
            public int a() {
                return this.f265326a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.S(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265326a);
                a1Var.l(this.f265327b);
                a1Var.l(this.f265328c);
                a1Var.d(this.f265329d);
                a1Var.d(this.f265330e);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C1837k c1837k = (C1837k) obj;
                if (this.f265326a != c1837k.f265326a) {
                    return false;
                }
                String str = this.f265327b;
                if (str == null ? c1837k.f265327b != null : !str.equals(c1837k.f265327b)) {
                    return false;
                }
                String str2 = this.f265328c;
                if (str2 == null ? c1837k.f265328c == null : str2.equals(c1837k.f265328c)) {
                    return this.f265329d == c1837k.f265329d && this.f265330e == c1837k.f265330e;
                }
                return false;
            }

            @Override // com.rabbitmq.client.a.b.k
            public String f() {
                return this.f265327b;
            }

            @Override // com.rabbitmq.client.a.b.k
            public String g() {
                return this.f265328c;
            }

            public int hashCode() {
                int i10 = this.f265326a * 31;
                String str = this.f265327b;
                int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f265328c;
                return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f265329d ? 1 : 0)) * 31) + (this.f265330e ? 1 : 0);
            }

            @Override // com.rabbitmq.client.a.b.k
            public boolean x() {
                return this.f265330e;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.publish";
            }

            public C1837k(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.h(), z0Var.b(), z0Var.b());
            }
        }

        public static class r extends y0 implements com.rabbitmq.client.a.b.r {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f265344e = 50;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265345a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265346b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f265347c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f265348d;

            public r(int i10, String str, String str2, String str3) {
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'exchange' must be non-null.");
                }
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'replyText' must be non-null.");
                }
                if (str3 == null) {
                    throw new IllegalStateException("Invalid configuration: 'routingKey' must be non-null.");
                }
                this.f265345a = i10;
                this.f265346b = str;
                this.f265347c = str2;
                this.f265348d = str3;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(reply-code=");
                sb2.append(this.f265345a);
                sb2.append(", reply-text=");
                sb2.append(this.f265346b);
                sb2.append(", exchange=");
                sb2.append(this.f265347c);
                sb2.append(", routing-key=");
                sb2.append(this.f265348d);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return true;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.E(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265345a);
                a1Var.l(this.f265346b);
                a1Var.l(this.f265347c);
                a1Var.l(this.f265348d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
            
                if (r6.f265346b != null) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
            
                if (r6.f265348d != null) goto L36;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r6) {
                /*
                    r5 = this;
                    r0 = 1
                    r4 = 0
                    if (r5 != r6) goto L5
                    return r0
                L5:
                    r4 = 7
                    r1 = 0
                    r4 = 5
                    if (r6 == 0) goto L64
                    r4 = 0
                    java.lang.Class r2 = r5.getClass()
                    r4 = 7
                    java.lang.Class r3 = r6.getClass()
                    if (r2 == r3) goto L17
                    goto L64
                L17:
                    com.rabbitmq.client.impl.k$b$r r6 = (com.rabbitmq.client.impl.k.b.r) r6
                    int r2 = r5.f265345a
                    int r3 = r6.f265345a
                    r4 = 0
                    if (r2 == r3) goto L21
                    return r1
                L21:
                    java.lang.String r2 = r5.f265346b
                    r4 = 4
                    if (r2 == 0) goto L31
                    java.lang.String r3 = r6.f265346b
                    boolean r2 = r2.equals(r3)
                    r4 = 5
                    if (r2 != 0) goto L36
                    r4 = 6
                    goto L35
                L31:
                    java.lang.String r2 = r6.f265346b
                    if (r2 == 0) goto L36
                L35:
                    return r1
                L36:
                    java.lang.String r2 = r5.f265347c
                    r4 = 2
                    if (r2 == 0) goto L45
                    java.lang.String r3 = r6.f265347c
                    r4 = 5
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L4a
                    goto L49
                L45:
                    java.lang.String r2 = r6.f265347c
                    if (r2 == 0) goto L4a
                L49:
                    return r1
                L4a:
                    java.lang.String r5 = r5.f265348d
                    r4 = 1
                    if (r5 == 0) goto L5b
                    r4 = 6
                    java.lang.String r6 = r6.f265348d
                    boolean r5 = r5.equals(r6)
                    r4 = 4
                    if (r5 != 0) goto L63
                    r4 = 5
                    goto L61
                L5b:
                    r4 = 7
                    java.lang.String r5 = r6.f265348d
                    r4 = 3
                    if (r5 == 0) goto L63
                L61:
                    r4 = 4
                    return r1
                L63:
                    return r0
                L64:
                    r4 = 6
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.b.r.equals(java.lang.Object):boolean");
            }

            @Override // com.rabbitmq.client.a.b.r
            public String f() {
                return this.f265347c;
            }

            @Override // com.rabbitmq.client.a.b.r
            public String g() {
                return this.f265348d;
            }

            public int hashCode() {
                int i10 = this.f265345a * 31;
                String str = this.f265346b;
                int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f265347c;
                int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f265348d;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.a.b.r
            public String m() {
                return this.f265346b;
            }

            @Override // com.rabbitmq.client.a.b.r
            public int n() {
                return this.f265345a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.return";
            }

            public r(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.h(), z0Var.h());
            }
        }

        public static class f extends y0 implements com.rabbitmq.client.a.b.f {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f265303f = 60;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f265304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f265305b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f265306c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f265307d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f265308e;

            public f(String str, long j10, boolean z10, String str2, String str3) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'consumerTag' must be non-null.");
                }
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'exchange' must be non-null.");
                }
                if (str3 == null) {
                    throw new IllegalStateException("Invalid configuration: 'routingKey' must be non-null.");
                }
                this.f265304a = str;
                this.f265305b = j10;
                this.f265306c = z10;
                this.f265307d = str2;
                this.f265308e = str3;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(consumer-tag=");
                sb2.append(this.f265304a);
                sb2.append(", delivery-tag=");
                sb2.append(this.f265305b);
                sb2.append(", redelivered=");
                sb2.append(this.f265306c);
                sb2.append(", exchange=");
                sb2.append(this.f265307d);
                sb2.append(", routing-key=");
                sb2.append(this.f265308e);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return true;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.x(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.l(this.f265304a);
                a1Var.f(this.f265305b);
                a1Var.d(this.f265306c);
                a1Var.l(this.f265307d);
                a1Var.l(this.f265308e);
            }

            /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
            
                if (r8.f265308e != null) goto L42;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r8) {
                /*
                    r7 = this;
                    r0 = 1
                    if (r7 != r8) goto L5
                    r6 = 3
                    return r0
                L5:
                    r1 = 0
                    if (r8 == 0) goto L6c
                    java.lang.Class r2 = r7.getClass()
                    r6 = 4
                    java.lang.Class r3 = r8.getClass()
                    r6 = 1
                    if (r2 == r3) goto L16
                    r6 = 5
                    goto L6c
                L16:
                    com.rabbitmq.client.impl.k$b$f r8 = (com.rabbitmq.client.impl.k.b.f) r8
                    java.lang.String r2 = r7.f265304a
                    if (r2 == 0) goto L26
                    java.lang.String r3 = r8.f265304a
                    boolean r2 = r2.equals(r3)
                    r6 = 2
                    if (r2 != 0) goto L2c
                    goto L2a
                L26:
                    java.lang.String r2 = r8.f265304a
                    if (r2 == 0) goto L2c
                L2a:
                    r6 = 0
                    return r1
                L2c:
                    long r2 = r7.f265305b
                    long r4 = r8.f265305b
                    int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    r6 = 7
                    if (r2 == 0) goto L37
                    r6 = 1
                    return r1
                L37:
                    boolean r2 = r7.f265306c
                    boolean r3 = r8.f265306c
                    if (r2 == r3) goto L3e
                    return r1
                L3e:
                    r6 = 4
                    java.lang.String r2 = r7.f265307d
                    r6 = 0
                    if (r2 == 0) goto L4e
                    java.lang.String r3 = r8.f265307d
                    boolean r2 = r2.equals(r3)
                    r6 = 6
                    if (r2 != 0) goto L54
                    goto L53
                L4e:
                    java.lang.String r2 = r8.f265307d
                    r6 = 2
                    if (r2 == 0) goto L54
                L53:
                    return r1
                L54:
                    java.lang.String r7 = r7.f265308e
                    r6 = 0
                    if (r7 == 0) goto L65
                    r6 = 1
                    java.lang.String r8 = r8.f265308e
                    boolean r7 = r7.equals(r8)
                    r6 = 4
                    if (r7 != 0) goto L6b
                    r6 = 1
                    goto L69
                L65:
                    java.lang.String r7 = r8.f265308e
                    if (r7 == 0) goto L6b
                L69:
                    r6 = 7
                    return r1
                L6b:
                    return r0
                L6c:
                    r6 = 2
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.b.f.equals(java.lang.Object):boolean");
            }

            @Override // com.rabbitmq.client.a.b.f
            public String f() {
                return this.f265307d;
            }

            @Override // com.rabbitmq.client.a.b.f
            public String g() {
                return this.f265308e;
            }

            @Override // com.rabbitmq.client.a.b.f
            public String h() {
                return this.f265304a;
            }

            public int hashCode() {
                String str = this.f265304a;
                int iHashCode = str != null ? str.hashCode() : 0;
                long j10 = this.f265305b;
                int i10 = ((((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f265306c ? 1 : 0)) * 31;
                String str2 = this.f265307d;
                int iHashCode2 = (i10 + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f265308e;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.a.b.f
            public long i() {
                return this.f265305b;
            }

            @Override // com.rabbitmq.client.a.b.f
            public boolean s() {
                return this.f265306c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.deliver";
            }

            public f(z0 z0Var) throws IOException {
                this(z0Var.h(), z0Var.d(), z0Var.b(), z0Var.h(), z0Var.h());
            }
        }

        public static class d extends y0 implements com.rabbitmq.client.a.b.d {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f265292i = 20;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265293a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265294b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f265295c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f265296d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final boolean f265297e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final boolean f265298f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final boolean f265299g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Map<String, Object> f265300h;

            public d(int i10, String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Map<String, Object> map) {
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'consumerTag' must be non-null.");
                }
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'queue' must be non-null.");
                }
                this.f265293a = i10;
                this.f265294b = str;
                this.f265295c = str2;
                this.f265296d = z10;
                this.f265297e = z11;
                this.f265298f = z12;
                this.f265299g = z13;
                this.f265300h = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 20;
            }

            @Override // com.rabbitmq.client.a.b.d
            public boolean L() {
                return this.f265296d;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265293a);
                sb2.append(", queue=");
                sb2.append(this.f265294b);
                sb2.append(", consumer-tag=");
                sb2.append(this.f265295c);
                sb2.append(", no-local=");
                sb2.append(this.f265296d);
                sb2.append(", no-ack=");
                sb2.append(this.f265297e);
                sb2.append(", exclusive=");
                sb2.append(this.f265298f);
                sb2.append(", nowait=");
                sb2.append(this.f265299g);
                sb2.append(", arguments=");
                sb2.append(this.f265300h);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.b.d
            public int a() {
                return this.f265293a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.v(this);
            }

            @Override // com.rabbitmq.client.a.b.d
            public boolean b() {
                return this.f265299g;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265293a);
                a1Var.l(this.f265294b);
                a1Var.l(this.f265295c);
                a1Var.d(this.f265296d);
                a1Var.d(this.f265297e);
                a1Var.d(this.f265298f);
                a1Var.d(this.f265299g);
                a1Var.m(this.f265300h);
            }

            @Override // com.rabbitmq.client.a.b.d
            public Map<String, Object> d() {
                return this.f265300h;
            }

            @Override // com.rabbitmq.client.a.b.d
            public String e() {
                return this.f265294b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                d dVar = (d) obj;
                if (this.f265293a != dVar.f265293a) {
                    return false;
                }
                String str = this.f265294b;
                if (str == null ? dVar.f265294b != null : !str.equals(dVar.f265294b)) {
                    return false;
                }
                String str2 = this.f265295c;
                if (str2 == null ? dVar.f265295c != null : !str2.equals(dVar.f265295c)) {
                    return false;
                }
                if (this.f265296d != dVar.f265296d || this.f265297e != dVar.f265297e || this.f265298f != dVar.f265298f || this.f265299g != dVar.f265299g) {
                    return false;
                }
                Map<String, Object> map = this.f265300h;
                return map == null ? dVar.f265300h == null : map.equals(dVar.f265300h);
            }

            @Override // com.rabbitmq.client.a.b.d
            public String h() {
                return this.f265295c;
            }

            public int hashCode() {
                int i10 = this.f265293a * 31;
                String str = this.f265294b;
                int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f265295c;
                int iHashCode2 = (((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f265296d ? 1 : 0)) * 31) + (this.f265297e ? 1 : 0)) * 31) + (this.f265298f ? 1 : 0)) * 31) + (this.f265299g ? 1 : 0)) * 31;
                Map<String, Object> map = this.f265300h;
                return iHashCode2 + (map != null ? map.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.a.b.d
            public boolean o() {
                return this.f265298f;
            }

            @Override // com.rabbitmq.client.a.b.d
            public boolean t() {
                return this.f265297e;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "basic.consume";
            }

            public d(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.h(), z0Var.b(), z0Var.b(), z0Var.b(), z0Var.b(), z0Var.i());
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f265349a = 20;

        public static class b extends y0 implements com.rabbitmq.client.a.d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265355a = 41;

            public b() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 41;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 20;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.h(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "channel.close-ok";
            }

            public b(z0 z0Var) throws IOException {
                this();
            }
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.impl.k$c$c, reason: collision with other inner class name */
        public static class C1838c extends y0 implements com.rabbitmq.client.a.d.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265356b = 20;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f265357a;

            public C1838c(boolean z10) {
                this.f265357a = z10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 20;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 20;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(active=");
                sb2.append(this.f265357a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.l(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.d(this.f265357a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.f265357a == ((C1838c) obj).f265357a;
            }

            public int hashCode() {
                return this.f265357a ? 1 : 0;
            }

            @Override // com.rabbitmq.client.a.d.c
            public boolean l() {
                return this.f265357a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "channel.flow";
            }

            public C1838c(z0 z0Var) throws IOException {
                this(z0Var.b());
            }
        }

        public static class d extends y0 implements com.rabbitmq.client.a.d.InterfaceC1782d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265358b = 21;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f265359a;

            public d(boolean z10) {
                this.f265359a = z10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 21;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 20;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(active=");
                sb2.append(this.f265359a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.K(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.d(this.f265359a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.f265359a == ((d) obj).f265359a;
            }

            public int hashCode() {
                return this.f265359a ? 1 : 0;
            }

            @Override // com.rabbitmq.client.a.d.InterfaceC1782d
            public boolean l() {
                return this.f265359a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "channel.flow-ok";
            }

            public d(z0 z0Var) throws IOException {
                this(z0Var.b());
            }
        }

        public static class e extends y0 implements com.rabbitmq.client.a.d.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265360b = 10;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f265361a;

            public e(String str) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'outOfBand' must be non-null.");
                }
                this.f265361a = str;
            }

            @Override // com.rabbitmq.client.a.d.e
            public String I() {
                return this.f265361a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 20;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(out-of-band=");
                sb2.append(this.f265361a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.z(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.l(this.f265361a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    e eVar = (e) obj;
                    String str = this.f265361a;
                    if (str != null) {
                        if (!str.equals(eVar.f265361a)) {
                        }
                    }
                    return eVar.f265361a == null;
                }
                return false;
            }

            public int hashCode() {
                String str = this.f265361a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "channel.open";
            }

            public e(z0 z0Var) throws IOException {
                this(z0Var.h());
            }
        }

        public static class f extends y0 implements com.rabbitmq.client.a.d.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265362b = 11;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.rabbitmq.client.k0 f265363a;

            public f(com.rabbitmq.client.k0 k0Var) {
                if (k0Var == null) {
                    throw new IllegalStateException("Invalid configuration: 'channelId' must be non-null.");
                }
                this.f265363a = k0Var;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 11;
            }

            @Override // com.rabbitmq.client.a.d.f
            public com.rabbitmq.client.k0 M() {
                return this.f265363a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 20;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(channel-id=");
                sb2.append(this.f265363a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.d0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.g(this.f265363a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                f fVar = (f) obj;
                com.rabbitmq.client.k0 k0Var = this.f265363a;
                return k0Var == null ? fVar.f265363a == null : k0Var.equals(fVar.f265363a);
            }

            public int hashCode() {
                com.rabbitmq.client.k0 k0Var = this.f265363a;
                if (k0Var != null) {
                    return k0Var.hashCode();
                }
                return 0;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "channel.open-ok";
            }

            public f(z0 z0Var) throws IOException {
                this(z0Var.e());
            }
        }

        public static class a extends y0 implements com.rabbitmq.client.a.d.InterfaceC1778a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f265350e = 40;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265351a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265352b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f265353c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final int f265354d;

            public a(int i10, String str, int i11, int i12) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'replyText' must be non-null.");
                }
                this.f265351a = i10;
                this.f265352b = str;
                this.f265353c = i11;
                this.f265354d = i12;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 20;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(reply-code=");
                sb2.append(this.f265351a);
                sb2.append(", reply-text=");
                sb2.append(this.f265352b);
                sb2.append(", class-id=");
                sb2.append(this.f265353c);
                sb2.append(", method-id=");
                sb2.append(this.f265354d);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.f0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265351a);
                a1Var.l(this.f265352b);
                a1Var.k(this.f265353c);
                a1Var.k(this.f265354d);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                if (this.f265351a != aVar.f265351a) {
                    return false;
                }
                String str = this.f265352b;
                if (str == null ? aVar.f265352b == null : str.equals(aVar.f265352b)) {
                    return this.f265353c == aVar.f265353c && this.f265354d == aVar.f265354d;
                }
                return false;
            }

            public int hashCode() {
                int i10 = this.f265351a * 31;
                String str = this.f265352b;
                return ((((i10 + (str != null ? str.hashCode() : 0)) * 31) + this.f265353c) * 31) + this.f265354d;
            }

            @Override // com.rabbitmq.client.a.d.InterfaceC1778a
            public String m() {
                return this.f265352b;
            }

            @Override // com.rabbitmq.client.a.d.InterfaceC1778a
            public int n() {
                return this.f265351a;
            }

            @Override // com.rabbitmq.client.a.d.InterfaceC1778a
            public int o1() {
                return this.f265353c;
            }

            @Override // com.rabbitmq.client.a.d.InterfaceC1778a
            public int p1() {
                return this.f265354d;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "channel.close";
            }

            public a(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.g(), z0Var.g());
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f265364a = 85;

        public static class b extends y0 implements com.rabbitmq.client.a.e.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265367a = 11;

            public b() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 11;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 85;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.Y(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "confirm.select-ok";
            }

            public b(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class a extends y0 implements com.rabbitmq.client.a.e.InterfaceC1786a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265365b = 10;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f265366a;

            public a(boolean z10) {
                this.f265366a = z10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 85;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(nowait=");
                sb2.append(this.f265366a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.p(this);
            }

            @Override // com.rabbitmq.client.a.e.InterfaceC1786a
            public boolean b() {
                return this.f265366a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.d(this.f265366a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f265366a == ((a) obj).f265366a;
                }
                return false;
            }

            public int hashCode() {
                return this.f265366a ? 1 : 0;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "confirm.select";
            }

            public a(z0 z0Var) throws IOException {
                this(z0Var.b());
            }
        }
    }

    public static class f implements h {
        @Override // com.rabbitmq.client.impl.k.h
        public Object A(i.d dVar) throws IOException {
            throw new com.rabbitmq.client.k2(dVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object B(b.e eVar) throws IOException {
            throw new com.rabbitmq.client.k2(eVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object C(b.j jVar) throws IOException {
            throw new com.rabbitmq.client.k2(jVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object D(a.C1835a c1835a) throws IOException {
            throw new com.rabbitmq.client.k2(c1835a);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object E(b.r rVar) throws IOException {
            throw new com.rabbitmq.client.k2(rVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object F(g.h hVar) throws IOException {
            throw new com.rabbitmq.client.k2(hVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object G(i.f fVar) throws IOException {
            throw new com.rabbitmq.client.k2(fVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object H(j.b bVar) throws IOException {
            throw new com.rabbitmq.client.k2(bVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object I(e.g gVar) throws IOException {
            throw new com.rabbitmq.client.k2(gVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object J(g.a aVar) throws IOException {
            throw new com.rabbitmq.client.k2(aVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object K(c.d dVar) throws IOException {
            throw new com.rabbitmq.client.k2(dVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object L(i.h hVar) throws IOException {
            throw new com.rabbitmq.client.k2(hVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object M(e.a aVar) throws IOException {
            throw new com.rabbitmq.client.k2(aVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object N(g.e eVar) throws IOException {
            throw new com.rabbitmq.client.k2(eVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object O(b.o oVar) throws IOException {
            throw new com.rabbitmq.client.k2(oVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object P(i.C1842i c1842i) throws IOException {
            throw new com.rabbitmq.client.k2(c1842i);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object Q(i.a aVar) throws IOException {
            throw new com.rabbitmq.client.k2(aVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object R(e.d dVar) throws IOException {
            throw new com.rabbitmq.client.k2(dVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object S(b.C1837k c1837k) throws IOException {
            throw new com.rabbitmq.client.k2(c1837k);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object T(b.n nVar) throws IOException {
            throw new com.rabbitmq.client.k2(nVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object U(e.m mVar) throws IOException {
            throw new com.rabbitmq.client.k2(mVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object V(j.d dVar) throws IOException {
            throw new com.rabbitmq.client.k2(dVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object W(j.c cVar) throws IOException {
            throw new com.rabbitmq.client.k2(cVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object X(g.b bVar) throws IOException {
            throw new com.rabbitmq.client.k2(bVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object Y(d.b bVar) throws IOException {
            throw new com.rabbitmq.client.k2(bVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object Z(j.a aVar) throws IOException {
            throw new com.rabbitmq.client.k2(aVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object a(e.l lVar) throws IOException {
            throw new com.rabbitmq.client.k2(lVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object a0(b.l lVar) throws IOException {
            throw new com.rabbitmq.client.k2(lVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object b(b.p pVar) throws IOException {
            throw new com.rabbitmq.client.k2(pVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object b0(e.n nVar) throws IOException {
            throw new com.rabbitmq.client.k2(nVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object c(b.m mVar) throws IOException {
            throw new com.rabbitmq.client.k2(mVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object c0(b.a aVar) throws IOException {
            throw new com.rabbitmq.client.k2(aVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object d(b.C1836b c1836b) throws IOException {
            throw new com.rabbitmq.client.k2(c1836b);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object d0(c.f fVar) throws IOException {
            throw new com.rabbitmq.client.k2(fVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object e(i.j jVar) throws IOException {
            throw new com.rabbitmq.client.k2(jVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object e0(g.d dVar) throws IOException {
            throw new com.rabbitmq.client.k2(dVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object f(e.i iVar) throws IOException {
            throw new com.rabbitmq.client.k2(iVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object f0(c.a aVar) throws IOException {
            throw new com.rabbitmq.client.k2(aVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object g(b.h hVar) throws IOException {
            throw new com.rabbitmq.client.k2(hVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object g0(e.f fVar) throws IOException {
            throw new com.rabbitmq.client.k2(fVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object h(c.b bVar) throws IOException {
            throw new com.rabbitmq.client.k2(bVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object h0(b.g gVar) throws IOException {
            throw new com.rabbitmq.client.k2(gVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object i(e.c cVar) throws IOException {
            throw new com.rabbitmq.client.k2(cVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object i0(b.q qVar) throws IOException {
            throw new com.rabbitmq.client.k2(qVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object j(b.i iVar) throws IOException {
            throw new com.rabbitmq.client.k2(iVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object j0(e.j jVar) throws IOException {
            throw new com.rabbitmq.client.k2(jVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object k(e.h hVar) throws IOException {
            throw new com.rabbitmq.client.k2(hVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object k0(i.b bVar) throws IOException {
            throw new com.rabbitmq.client.k2(bVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object l(c.C1838c c1838c) throws IOException {
            throw new com.rabbitmq.client.k2(c1838c);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object l0(j.e eVar) throws IOException {
            throw new com.rabbitmq.client.k2(eVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object m(j.f fVar) throws IOException {
            throw new com.rabbitmq.client.k2(fVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object m0(e.b bVar) throws IOException {
            throw new com.rabbitmq.client.k2(bVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object n(g.c cVar) throws IOException {
            throw new com.rabbitmq.client.k2(cVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object n0(i.e eVar) throws IOException {
            throw new com.rabbitmq.client.k2(eVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object o(g.f fVar) throws IOException {
            throw new com.rabbitmq.client.k2(fVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object p(d.a aVar) throws IOException {
            throw new com.rabbitmq.client.k2(aVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object q(b.c cVar) throws IOException {
            throw new com.rabbitmq.client.k2(cVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object r(e.C1839e c1839e) throws IOException {
            throw new com.rabbitmq.client.k2(c1839e);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object s(g.C1841g c1841g) throws IOException {
            throw new com.rabbitmq.client.k2(c1841g);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object t(i.c cVar) throws IOException {
            throw new com.rabbitmq.client.k2(cVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object u(i.g gVar) throws IOException {
            throw new com.rabbitmq.client.k2(gVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object v(b.d dVar) throws IOException {
            throw new com.rabbitmq.client.k2(dVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object w(e.C1840k c1840k) throws IOException {
            throw new com.rabbitmq.client.k2(c1840k);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object x(b.f fVar) throws IOException {
            throw new com.rabbitmq.client.k2(fVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object y(a.b bVar) throws IOException {
            throw new com.rabbitmq.client.k2(bVar);
        }

        @Override // com.rabbitmq.client.impl.k.h
        public Object z(c.e eVar) throws IOException {
            throw new com.rabbitmq.client.k2(eVar);
        }
    }

    public interface h {
        Object A(i.d dVar) throws IOException;

        Object B(b.e eVar) throws IOException;

        Object C(b.j jVar) throws IOException;

        Object D(a.C1835a c1835a) throws IOException;

        Object E(b.r rVar) throws IOException;

        Object F(g.h hVar) throws IOException;

        Object G(i.f fVar) throws IOException;

        Object H(j.b bVar) throws IOException;

        Object I(e.g gVar) throws IOException;

        Object J(g.a aVar) throws IOException;

        Object K(c.d dVar) throws IOException;

        Object L(i.h hVar) throws IOException;

        Object M(e.a aVar) throws IOException;

        Object N(g.e eVar) throws IOException;

        Object O(b.o oVar) throws IOException;

        Object P(i.C1842i c1842i) throws IOException;

        Object Q(i.a aVar) throws IOException;

        Object R(e.d dVar) throws IOException;

        Object S(b.C1837k c1837k) throws IOException;

        Object T(b.n nVar) throws IOException;

        Object U(e.m mVar) throws IOException;

        Object V(j.d dVar) throws IOException;

        Object W(j.c cVar) throws IOException;

        Object X(g.b bVar) throws IOException;

        Object Y(d.b bVar) throws IOException;

        Object Z(j.a aVar) throws IOException;

        Object a(e.l lVar) throws IOException;

        Object a0(b.l lVar) throws IOException;

        Object b(b.p pVar) throws IOException;

        Object b0(e.n nVar) throws IOException;

        Object c(b.m mVar) throws IOException;

        Object c0(b.a aVar) throws IOException;

        Object d(b.C1836b c1836b) throws IOException;

        Object d0(c.f fVar) throws IOException;

        Object e(i.j jVar) throws IOException;

        Object e0(g.d dVar) throws IOException;

        Object f(e.i iVar) throws IOException;

        Object f0(c.a aVar) throws IOException;

        Object g(b.h hVar) throws IOException;

        Object g0(e.f fVar) throws IOException;

        Object h(c.b bVar) throws IOException;

        Object h0(b.g gVar) throws IOException;

        Object i(e.c cVar) throws IOException;

        Object i0(b.q qVar) throws IOException;

        Object j(b.i iVar) throws IOException;

        Object j0(e.j jVar) throws IOException;

        Object k(e.h hVar) throws IOException;

        Object k0(i.b bVar) throws IOException;

        Object l(c.C1838c c1838c) throws IOException;

        Object l0(j.e eVar) throws IOException;

        Object m(j.f fVar) throws IOException;

        Object m0(e.b bVar) throws IOException;

        Object n(g.c cVar) throws IOException;

        Object n0(i.e eVar) throws IOException;

        Object o(g.f fVar) throws IOException;

        Object p(d.a aVar) throws IOException;

        Object q(b.c cVar) throws IOException;

        Object r(e.C1839e c1839e) throws IOException;

        Object s(g.C1841g c1841g) throws IOException;

        Object t(i.c cVar) throws IOException;

        Object u(i.g gVar) throws IOException;

        Object v(b.d dVar) throws IOException;

        Object w(e.C1840k c1840k) throws IOException;

        Object x(b.f fVar) throws IOException;

        Object y(a.b bVar) throws IOException;

        Object z(c.e eVar) throws IOException;
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f265445a = 50;

        public static class b extends y0 implements com.rabbitmq.client.a.i.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265453a = 21;

            public b() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 21;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.k0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "queue.bind-ok";
            }

            public b(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class j extends y0 implements com.rabbitmq.client.a.i.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265487a = 51;

            public j() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 51;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.e(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "queue.unbind-ok";
            }

            public j(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class f extends y0 implements com.rabbitmq.client.a.i.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265473b = 41;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265474a;

            public f(int i10) {
                this.f265474a = i10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 41;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(message-count=");
                sb2.append(this.f265474a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.G(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.e(this.f265474a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.f265474a == ((f) obj).f265474a;
            }

            public int hashCode() {
                return this.f265474a;
            }

            @Override // com.rabbitmq.client.a.i.f
            public int k() {
                return this.f265474a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "queue.delete-ok";
            }

            public f(z0 z0Var) throws IOException {
                this(z0Var.c());
            }
        }

        public static class h extends y0 implements com.rabbitmq.client.a.i.h {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265479b = 31;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265480a;

            public h(int i10) {
                this.f265480a = i10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 31;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(message-count=");
                sb2.append(this.f265480a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.L(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.e(this.f265480a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.f265480a == ((h) obj).f265480a;
            }

            public int hashCode() {
                return this.f265480a;
            }

            @Override // com.rabbitmq.client.a.i.h
            public int k() {
                return this.f265480a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "queue.purge-ok";
            }

            public h(z0 z0Var) throws IOException {
                this(z0Var.c());
            }
        }

        public static class d extends y0 implements com.rabbitmq.client.a.i.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f265463d = 11;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f265464a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f265465b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f265466c;

            public d(String str, int i10, int i11) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'queue' must be non-null.");
                }
                this.f265464a = str;
                this.f265465b = i10;
                this.f265466c = i11;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 11;
            }

            @Override // com.rabbitmq.client.a.i.d
            public int Q() {
                return this.f265466c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(queue=");
                sb2.append(this.f265464a);
                sb2.append(", message-count=");
                sb2.append(this.f265465b);
                sb2.append(", consumer-count=");
                sb2.append(this.f265466c);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.A(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.l(this.f265464a);
                a1Var.e(this.f265465b);
                a1Var.e(this.f265466c);
            }

            @Override // com.rabbitmq.client.a.i.d
            public String e() {
                return this.f265464a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                d dVar = (d) obj;
                String str = this.f265464a;
                if (str == null ? dVar.f265464a == null : str.equals(dVar.f265464a)) {
                    return this.f265465b == dVar.f265465b && this.f265466c == dVar.f265466c;
                }
                return false;
            }

            public int hashCode() {
                String str = this.f265464a;
                return ((((str != null ? str.hashCode() : 0) * 31) + this.f265465b) * 31) + this.f265466c;
            }

            @Override // com.rabbitmq.client.a.i.d
            public int k() {
                return this.f265465b;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "queue.declare-ok";
            }

            public d(z0 z0Var) throws IOException {
                this(z0Var.h(), z0Var.c(), z0Var.c());
            }
        }

        public static class g extends y0 implements com.rabbitmq.client.a.i.g {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f265475d = 30;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265476a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265477b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f265478c;

            public g(int i10, String str, boolean z10) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'queue' must be non-null.");
                }
                this.f265476a = i10;
                this.f265477b = str;
                this.f265478c = z10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 30;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265476a);
                sb2.append(", queue=");
                sb2.append(this.f265477b);
                sb2.append(", nowait=");
                sb2.append(this.f265478c);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.i.g
            public int a() {
                return this.f265476a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.u(this);
            }

            @Override // com.rabbitmq.client.a.i.g
            public boolean b() {
                return this.f265478c;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265476a);
                a1Var.l(this.f265477b);
                a1Var.d(this.f265478c);
            }

            @Override // com.rabbitmq.client.a.i.g
            public String e() {
                return this.f265477b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                g gVar = (g) obj;
                if (this.f265476a != gVar.f265476a) {
                    return false;
                }
                String str = this.f265477b;
                if (str == null ? gVar.f265477b == null : str.equals(gVar.f265477b)) {
                    return this.f265478c == gVar.f265478c;
                }
                return false;
            }

            public int hashCode() {
                int i10 = this.f265476a * 31;
                String str = this.f265477b;
                return ((i10 + (str != null ? str.hashCode() : 0)) * 31) + (this.f265478c ? 1 : 0);
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "queue.purge";
            }

            public g(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.b());
            }
        }

        public static class e extends y0 implements com.rabbitmq.client.a.i.e {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f265467f = 40;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265468a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265469b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f265470c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f265471d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final boolean f265472e;

            public e(int i10, String str, boolean z10, boolean z11, boolean z12) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'queue' must be non-null.");
                }
                this.f265468a = i10;
                this.f265469b = str;
                this.f265470c = z10;
                this.f265471d = z11;
                this.f265472e = z12;
            }

            @Override // com.rabbitmq.client.a.i.e
            public boolean H() {
                return this.f265471d;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265468a);
                sb2.append(", queue=");
                sb2.append(this.f265469b);
                sb2.append(", if-unused=");
                sb2.append(this.f265470c);
                sb2.append(", if-empty=");
                sb2.append(this.f265471d);
                sb2.append(", nowait=");
                sb2.append(this.f265472e);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.i.e
            public int a() {
                return this.f265468a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.n0(this);
            }

            @Override // com.rabbitmq.client.a.i.e
            public boolean b() {
                return this.f265472e;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265468a);
                a1Var.l(this.f265469b);
                a1Var.d(this.f265470c);
                a1Var.d(this.f265471d);
                a1Var.d(this.f265472e);
            }

            @Override // com.rabbitmq.client.a.i.e
            public String e() {
                return this.f265469b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                e eVar = (e) obj;
                if (this.f265468a != eVar.f265468a) {
                    return false;
                }
                String str = this.f265469b;
                if (str == null ? eVar.f265469b == null : str.equals(eVar.f265469b)) {
                    return this.f265470c == eVar.f265470c && this.f265471d == eVar.f265471d && this.f265472e == eVar.f265472e;
                }
                return false;
            }

            public int hashCode() {
                int i10 = this.f265468a * 31;
                String str = this.f265469b;
                return ((((((i10 + (str != null ? str.hashCode() : 0)) * 31) + (this.f265470c ? 1 : 0)) * 31) + (this.f265471d ? 1 : 0)) * 31) + (this.f265472e ? 1 : 0);
            }

            @Override // com.rabbitmq.client.a.i.e
            public boolean v() {
                return this.f265470c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "queue.delete";
            }

            public e(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.b(), z0Var.b(), z0Var.b());
            }
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.impl.k$i$i, reason: collision with other inner class name */
        public static class C1842i extends y0 implements com.rabbitmq.client.a.i.InterfaceC1824i {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f265481f = 50;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265482a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265483b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f265484c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f265485d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Map<String, Object> f265486e;

            public C1842i(int i10, String str, String str2, String str3, Map<String, Object> map) {
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'exchange' must be non-null.");
                }
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'queue' must be non-null.");
                }
                if (str3 == null) {
                    throw new IllegalStateException("Invalid configuration: 'routingKey' must be non-null.");
                }
                this.f265482a = i10;
                this.f265483b = str;
                this.f265484c = str2;
                this.f265485d = str3;
                this.f265486e = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265482a);
                sb2.append(", queue=");
                sb2.append(this.f265483b);
                sb2.append(", exchange=");
                sb2.append(this.f265484c);
                sb2.append(", routing-key=");
                sb2.append(this.f265485d);
                sb2.append(", arguments=");
                sb2.append(this.f265486e);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.i.InterfaceC1824i
            public int a() {
                return this.f265482a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.P(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265482a);
                a1Var.l(this.f265483b);
                a1Var.l(this.f265484c);
                a1Var.l(this.f265485d);
                a1Var.m(this.f265486e);
            }

            @Override // com.rabbitmq.client.a.i.InterfaceC1824i
            public Map<String, Object> d() {
                return this.f265486e;
            }

            @Override // com.rabbitmq.client.a.i.InterfaceC1824i
            public String e() {
                return this.f265483b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
            
                if (r6.f265484c != null) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
            
                if (r6.f265486e != null) goto L45;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r6) {
                /*
                    r5 = this;
                    r0 = 1
                    if (r5 != r6) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r6 == 0) goto L73
                    java.lang.Class r2 = r5.getClass()
                    java.lang.Class r3 = r6.getClass()
                    r4 = 1
                    if (r2 == r3) goto L13
                    goto L73
                L13:
                    com.rabbitmq.client.impl.k$i$i r6 = (com.rabbitmq.client.impl.k.i.C1842i) r6
                    int r2 = r5.f265482a
                    int r3 = r6.f265482a
                    r4 = 7
                    if (r2 == r3) goto L1e
                    r4 = 5
                    return r1
                L1e:
                    java.lang.String r2 = r5.f265483b
                    if (r2 == 0) goto L2c
                    java.lang.String r3 = r6.f265483b
                    boolean r2 = r2.equals(r3)
                    r4 = 6
                    if (r2 != 0) goto L32
                    goto L31
                L2c:
                    r4 = 4
                    java.lang.String r2 = r6.f265483b
                    if (r2 == 0) goto L32
                L31:
                    return r1
                L32:
                    java.lang.String r2 = r5.f265484c
                    r4 = 5
                    if (r2 == 0) goto L44
                    r4 = 2
                    java.lang.String r3 = r6.f265484c
                    r4 = 0
                    boolean r2 = r2.equals(r3)
                    r4 = 4
                    if (r2 != 0) goto L49
                    r4 = 2
                    goto L48
                L44:
                    java.lang.String r2 = r6.f265484c
                    if (r2 == 0) goto L49
                L48:
                    return r1
                L49:
                    java.lang.String r2 = r5.f265485d
                    if (r2 == 0) goto L57
                    java.lang.String r3 = r6.f265485d
                    r4 = 5
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L5c
                    goto L5b
                L57:
                    java.lang.String r2 = r6.f265485d
                    if (r2 == 0) goto L5c
                L5b:
                    return r1
                L5c:
                    r4 = 2
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f265486e
                    if (r5 == 0) goto L6b
                    java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f265486e
                    boolean r5 = r5.equals(r6)
                    if (r5 != 0) goto L72
                    r4 = 1
                    goto L70
                L6b:
                    r4 = 3
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r6.f265486e
                    if (r5 == 0) goto L72
                L70:
                    r4 = 7
                    return r1
                L72:
                    return r0
                L73:
                    r4 = 4
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.i.C1842i.equals(java.lang.Object):boolean");
            }

            @Override // com.rabbitmq.client.a.i.InterfaceC1824i
            public String f() {
                return this.f265484c;
            }

            @Override // com.rabbitmq.client.a.i.InterfaceC1824i
            public String g() {
                return this.f265485d;
            }

            public int hashCode() {
                int i10 = this.f265482a * 31;
                String str = this.f265483b;
                int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f265484c;
                int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f265485d;
                int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Map<String, Object> map = this.f265486e;
                return iHashCode3 + (map != null ? map.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "queue.unbind";
            }

            public C1842i(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.h(), z0Var.h(), z0Var.i());
            }
        }

        public static class a extends y0 implements com.rabbitmq.client.a.i.InterfaceC1815a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f265446g = 20;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265447a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265448b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f265449c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f265450d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final boolean f265451e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Map<String, Object> f265452f;

            public a(int i10, String str, String str2, String str3, boolean z10, Map<String, Object> map) {
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'exchange' must be non-null.");
                }
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'queue' must be non-null.");
                }
                if (str3 == null) {
                    throw new IllegalStateException("Invalid configuration: 'routingKey' must be non-null.");
                }
                this.f265447a = i10;
                this.f265448b = str;
                this.f265449c = str2;
                this.f265450d = str3;
                this.f265451e = z10;
                this.f265452f = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 20;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265447a);
                sb2.append(", queue=");
                sb2.append(this.f265448b);
                sb2.append(", exchange=");
                sb2.append(this.f265449c);
                sb2.append(", routing-key=");
                sb2.append(this.f265450d);
                sb2.append(", nowait=");
                sb2.append(this.f265451e);
                sb2.append(", arguments=");
                sb2.append(this.f265452f);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.i.InterfaceC1815a
            public int a() {
                return this.f265447a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.Q(this);
            }

            @Override // com.rabbitmq.client.a.i.InterfaceC1815a
            public boolean b() {
                return this.f265451e;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265447a);
                a1Var.l(this.f265448b);
                a1Var.l(this.f265449c);
                a1Var.l(this.f265450d);
                a1Var.d(this.f265451e);
                a1Var.m(this.f265452f);
            }

            @Override // com.rabbitmq.client.a.i.InterfaceC1815a
            public Map<String, Object> d() {
                return this.f265452f;
            }

            @Override // com.rabbitmq.client.a.i.InterfaceC1815a
            public String e() {
                return this.f265448b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
            
                if (r6.f265450d != null) goto L38;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r6) {
                /*
                    r5 = this;
                    r0 = 7
                    r0 = 1
                    if (r5 != r6) goto L6
                    r4 = 5
                    return r0
                L6:
                    r1 = 0
                    r4 = r1
                    if (r6 == 0) goto L7e
                    java.lang.Class r2 = r5.getClass()
                    r4 = 0
                    java.lang.Class r3 = r6.getClass()
                    r4 = 3
                    if (r2 == r3) goto L17
                    goto L7e
                L17:
                    com.rabbitmq.client.impl.k$i$a r6 = (com.rabbitmq.client.impl.k.i.a) r6
                    int r2 = r5.f265447a
                    int r3 = r6.f265447a
                    r4 = 4
                    if (r2 == r3) goto L21
                    return r1
                L21:
                    java.lang.String r2 = r5.f265448b
                    r4 = 4
                    if (r2 == 0) goto L31
                    java.lang.String r3 = r6.f265448b
                    r4 = 4
                    boolean r2 = r2.equals(r3)
                    r4 = 7
                    if (r2 != 0) goto L36
                    goto L35
                L31:
                    java.lang.String r2 = r6.f265448b
                    if (r2 == 0) goto L36
                L35:
                    return r1
                L36:
                    java.lang.String r2 = r5.f265449c
                    if (r2 == 0) goto L43
                    java.lang.String r3 = r6.f265449c
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L49
                    goto L47
                L43:
                    java.lang.String r2 = r6.f265449c
                    if (r2 == 0) goto L49
                L47:
                    r4 = 7
                    return r1
                L49:
                    r4 = 4
                    java.lang.String r2 = r5.f265450d
                    if (r2 == 0) goto L59
                    java.lang.String r3 = r6.f265450d
                    boolean r2 = r2.equals(r3)
                    r4 = 2
                    if (r2 != 0) goto L5f
                    r4 = 1
                    goto L5e
                L59:
                    java.lang.String r2 = r6.f265450d
                    r4 = 0
                    if (r2 == 0) goto L5f
                L5e:
                    return r1
                L5f:
                    r4 = 2
                    boolean r2 = r5.f265451e
                    r4 = 4
                    boolean r3 = r6.f265451e
                    if (r2 == r3) goto L68
                    return r1
                L68:
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f265452f
                    r4 = 5
                    if (r5 == 0) goto L76
                    java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f265452f
                    boolean r5 = r5.equals(r6)
                    if (r5 != 0) goto L7c
                    goto L7a
                L76:
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r6.f265452f
                    if (r5 == 0) goto L7c
                L7a:
                    r4 = 3
                    return r1
                L7c:
                    r4 = 6
                    return r0
                L7e:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.i.a.equals(java.lang.Object):boolean");
            }

            @Override // com.rabbitmq.client.a.i.InterfaceC1815a
            public String f() {
                return this.f265449c;
            }

            @Override // com.rabbitmq.client.a.i.InterfaceC1815a
            public String g() {
                return this.f265450d;
            }

            public int hashCode() {
                int i10 = this.f265447a * 31;
                String str = this.f265448b;
                int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f265449c;
                int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f265450d;
                int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f265451e ? 1 : 0)) * 31;
                Map<String, Object> map = this.f265452f;
                return iHashCode3 + (map != null ? map.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "queue.bind";
            }

            public a(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.h(), z0Var.h(), z0Var.b(), z0Var.i());
            }
        }

        public static class c extends y0 implements com.rabbitmq.client.a.i.c {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f265454i = 10;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265455a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265456b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f265457c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f265458d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final boolean f265459e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final boolean f265460f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final boolean f265461g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Map<String, Object> f265462h;

            public c(int i10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Map<String, Object> map) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'queue' must be non-null.");
                }
                this.f265455a = i10;
                this.f265456b = str;
                this.f265457c = z10;
                this.f265458d = z11;
                this.f265459e = z12;
                this.f265460f = z13;
                this.f265461g = z14;
                this.f265462h = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265455a);
                sb2.append(", queue=");
                sb2.append(this.f265456b);
                sb2.append(", passive=");
                sb2.append(this.f265457c);
                sb2.append(", durable=");
                sb2.append(this.f265458d);
                sb2.append(", exclusive=");
                sb2.append(this.f265459e);
                sb2.append(", auto-delete=");
                sb2.append(this.f265460f);
                sb2.append(", nowait=");
                sb2.append(this.f265461g);
                sb2.append(", arguments=");
                sb2.append(this.f265462h);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.i.c
            public int a() {
                return this.f265455a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.t(this);
            }

            @Override // com.rabbitmq.client.a.i.c
            public boolean b() {
                return this.f265461g;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265455a);
                a1Var.l(this.f265456b);
                a1Var.d(this.f265457c);
                a1Var.d(this.f265458d);
                a1Var.d(this.f265459e);
                a1Var.d(this.f265460f);
                a1Var.d(this.f265461g);
                a1Var.m(this.f265462h);
            }

            @Override // com.rabbitmq.client.a.i.c
            public Map<String, Object> d() {
                return this.f265462h;
            }

            @Override // com.rabbitmq.client.a.i.c
            public String e() {
                return this.f265456b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                c cVar = (c) obj;
                if (this.f265455a != cVar.f265455a) {
                    return false;
                }
                String str = this.f265456b;
                if (str == null ? cVar.f265456b != null : !str.equals(cVar.f265456b)) {
                    return false;
                }
                if (this.f265457c == cVar.f265457c && this.f265458d == cVar.f265458d && this.f265459e == cVar.f265459e && this.f265460f == cVar.f265460f && this.f265461g == cVar.f265461g) {
                    Map<String, Object> map = this.f265462h;
                    return map == null ? cVar.f265462h == null : map.equals(cVar.f265462h);
                }
                return false;
            }

            public int hashCode() {
                int i10 = this.f265455a * 31;
                String str = this.f265456b;
                int iHashCode = (((((((((((i10 + (str != null ? str.hashCode() : 0)) * 31) + (this.f265457c ? 1 : 0)) * 31) + (this.f265458d ? 1 : 0)) * 31) + (this.f265459e ? 1 : 0)) * 31) + (this.f265460f ? 1 : 0)) * 31) + (this.f265461g ? 1 : 0)) * 31;
                Map<String, Object> map = this.f265462h;
                return iHashCode + (map != null ? map.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.a.i.c
            public boolean o() {
                return this.f265459e;
            }

            @Override // com.rabbitmq.client.a.i.c
            public boolean q() {
                return this.f265457c;
            }

            @Override // com.rabbitmq.client.a.i.c
            public boolean r() {
                return this.f265460f;
            }

            @Override // com.rabbitmq.client.a.i.c
            public boolean u() {
                return this.f265458d;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "queue.declare";
            }

            public c(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.b(), z0Var.b(), z0Var.b(), z0Var.b(), z0Var.b(), z0Var.i());
            }
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f265488a = 90;

        public static class a extends y0 implements com.rabbitmq.client.a.j.InterfaceC1827a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265489a = 20;

            public a() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 20;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 90;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.Z(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "tx.commit";
            }

            public a(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class b extends y0 implements com.rabbitmq.client.a.j.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265490a = 21;

            public b() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 21;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 90;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.H(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "tx.commit-ok";
            }

            public b(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class c extends y0 implements com.rabbitmq.client.a.j.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265491a = 30;

            public c() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 30;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 90;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.W(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "tx.rollback";
            }

            public c(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class d extends y0 implements com.rabbitmq.client.a.j.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265492a = 31;

            public d() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 31;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 90;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.V(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "tx.rollback-ok";
            }

            public d(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class e extends y0 implements com.rabbitmq.client.a.j.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265493a = 10;

            public e() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 90;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.l0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "tx.select";
            }

            public e(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class f extends y0 implements com.rabbitmq.client.a.j.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265494a = 11;

            public f() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 11;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 90;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.m(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "tx.select-ok";
            }

            public f(z0 z0Var) throws IOException {
                this();
            }
        }
    }

    public static com.rabbitmq.client.impl.j a(DataInputStream dataInputStream) throws IOException {
        short s10 = dataInputStream.readShort();
        if (s10 == 60) {
            return new com.rabbitmq.client.a.c(dataInputStream);
        }
        throw new com.rabbitmq.client.l2(s10);
    }

    public static y0 b(DataInputStream dataInputStream) throws IOException {
        short s10 = dataInputStream.readShort();
        short s11 = dataInputStream.readShort();
        if (s10 != 10) {
            if (s10 != 20) {
                if (s10 != 30) {
                    if (s10 != 40) {
                        if (s10 != 50) {
                            if (s10 == 60) {
                                if (s11 == 10) {
                                    return new b.l(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 11) {
                                    return new b.m(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 20) {
                                    return new b.d(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 21) {
                                    return new b.e(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 30) {
                                    return new b.C1836b(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 31) {
                                    return new b.c(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 40) {
                                    return new b.C1837k(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 50) {
                                    return new b.r(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 60) {
                                    return new b.f(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 80) {
                                    return new b.a(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 90) {
                                    return new b.q(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 100) {
                                    return new b.o(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 120) {
                                    return new b.j(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 110) {
                                    return new b.n(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 111) {
                                    return new b.p(new z0(new j2(dataInputStream)));
                                }
                                switch (s11) {
                                    case 70:
                                        return new b.g(new z0(new j2(dataInputStream)));
                                    case 71:
                                        return new b.i(new z0(new j2(dataInputStream)));
                                    case 72:
                                        return new b.h(new z0(new j2(dataInputStream)));
                                }
                            }
                            if (s10 != 85) {
                                if (s10 == 90) {
                                    if (s11 == 10) {
                                        return new j.e(new z0(new j2(dataInputStream)));
                                    }
                                    if (s11 == 11) {
                                        return new j.f(new z0(new j2(dataInputStream)));
                                    }
                                    if (s11 == 20) {
                                        return new j.a(new z0(new j2(dataInputStream)));
                                    }
                                    if (s11 == 21) {
                                        return new j.b(new z0(new j2(dataInputStream)));
                                    }
                                    if (s11 == 30) {
                                        return new j.c(new z0(new j2(dataInputStream)));
                                    }
                                    if (s11 == 31) {
                                        return new j.d(new z0(new j2(dataInputStream)));
                                    }
                                }
                            } else {
                                if (s11 == 10) {
                                    return new d.a(new z0(new j2(dataInputStream)));
                                }
                                if (s11 == 11) {
                                    return new d.b(new z0(new j2(dataInputStream)));
                                }
                            }
                        } else {
                            if (s11 == 10) {
                                return new i.c(new z0(new j2(dataInputStream)));
                            }
                            if (s11 == 11) {
                                return new i.d(new z0(new j2(dataInputStream)));
                            }
                            if (s11 == 20) {
                                return new i.a(new z0(new j2(dataInputStream)));
                            }
                            if (s11 == 21) {
                                return new i.b(new z0(new j2(dataInputStream)));
                            }
                            if (s11 == 30) {
                                return new i.g(new z0(new j2(dataInputStream)));
                            }
                            if (s11 == 31) {
                                return new i.h(new z0(new j2(dataInputStream)));
                            }
                            if (s11 == 40) {
                                return new i.e(new z0(new j2(dataInputStream)));
                            }
                            if (s11 == 41) {
                                return new i.f(new z0(new j2(dataInputStream)));
                            }
                            if (s11 == 50) {
                                return new i.C1842i(new z0(new j2(dataInputStream)));
                            }
                            if (s11 == 51) {
                                return new i.j(new z0(new j2(dataInputStream)));
                            }
                        }
                    } else {
                        if (s11 == 10) {
                            return new g.c(new z0(new j2(dataInputStream)));
                        }
                        if (s11 == 11) {
                            return new g.d(new z0(new j2(dataInputStream)));
                        }
                        if (s11 == 20) {
                            return new g.e(new z0(new j2(dataInputStream)));
                        }
                        if (s11 == 21) {
                            return new g.f(new z0(new j2(dataInputStream)));
                        }
                        if (s11 == 30) {
                            return new g.a(new z0(new j2(dataInputStream)));
                        }
                        if (s11 == 31) {
                            return new g.b(new z0(new j2(dataInputStream)));
                        }
                        if (s11 == 40) {
                            return new g.C1841g(new z0(new j2(dataInputStream)));
                        }
                        if (s11 == 51) {
                            return new g.h(new z0(new j2(dataInputStream)));
                        }
                    }
                } else {
                    if (s11 == 10) {
                        return new a.C1835a(new z0(new j2(dataInputStream)));
                    }
                    if (s11 == 11) {
                        return new a.b(new z0(new j2(dataInputStream)));
                    }
                }
            } else {
                if (s11 == 10) {
                    return new c.e(new z0(new j2(dataInputStream)));
                }
                if (s11 == 11) {
                    return new c.f(new z0(new j2(dataInputStream)));
                }
                if (s11 == 20) {
                    return new c.C1838c(new z0(new j2(dataInputStream)));
                }
                if (s11 == 21) {
                    return new c.d(new z0(new j2(dataInputStream)));
                }
                if (s11 == 40) {
                    return new c.a(new z0(new j2(dataInputStream)));
                }
                if (s11 == 41) {
                    return new c.b(new z0(new j2(dataInputStream)));
                }
            }
        } else {
            if (s11 == 10) {
                return new e.h(new z0(new j2(dataInputStream)));
            }
            if (s11 == 11) {
                return new e.i(new z0(new j2(dataInputStream)));
            }
            if (s11 == 20) {
                return new e.f(new z0(new j2(dataInputStream)));
            }
            if (s11 == 21) {
                return new e.g(new z0(new j2(dataInputStream)));
            }
            if (s11 == 30) {
                return new e.j(new z0(new j2(dataInputStream)));
            }
            if (s11 == 31) {
                return new e.C1840k(new z0(new j2(dataInputStream)));
            }
            if (s11 == 40) {
                return new e.d(new z0(new j2(dataInputStream)));
            }
            if (s11 == 41) {
                return new e.C1839e(new z0(new j2(dataInputStream)));
            }
            if (s11 == 50) {
                return new e.b(new z0(new j2(dataInputStream)));
            }
            if (s11 == 51) {
                return new e.c(new z0(new j2(dataInputStream)));
            }
            if (s11 == 60) {
                return new e.a(new z0(new j2(dataInputStream)));
            }
            if (s11 == 61) {
                return new e.l(new z0(new j2(dataInputStream)));
            }
            if (s11 == 70) {
                return new e.m(new z0(new j2(dataInputStream)));
            }
            if (s11 == 71) {
                return new e.n(new z0(new j2(dataInputStream)));
            }
        }
        throw new com.rabbitmq.client.l2(s10, s11);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f265368a = 10;

        public static class c extends y0 implements com.rabbitmq.client.a.f.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265376a = 51;

            public c() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 51;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.i(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.close-ok";
            }

            public c(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class l extends y0 implements com.rabbitmq.client.a.f.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265406a = 61;

            public l() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 61;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.a(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.unblocked";
            }

            public l(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class n extends y0 implements com.rabbitmq.client.a.f.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265410a = 71;

            public n() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 71;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.b0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.update-secret-ok";
            }

            public n(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class a extends y0 implements com.rabbitmq.client.a.f.InterfaceC1789a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265369b = 60;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f265370a;

            public a(String str) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'reason' must be non-null.");
                }
                this.f265370a = str;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 60;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(reason=");
                sb2.append(this.f265370a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.M(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.l(this.f265370a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                String str = this.f265370a;
                return str == null ? aVar.f265370a == null : str.equals(aVar.f265370a);
            }

            public int hashCode() {
                String str = this.f265370a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            @Override // com.rabbitmq.client.a.f.InterfaceC1789a
            public String u0() {
                return this.f265370a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.blocked";
            }

            public a(z0 z0Var) throws IOException {
                this(z0Var.h());
            }
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.impl.k$e$e, reason: collision with other inner class name */
        public static class C1839e extends y0 implements com.rabbitmq.client.a.f.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265381b = 41;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f265382a;

            public C1839e(String str) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'knownHosts' must be non-null.");
                }
                this.f265382a = str;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 41;
            }

            @Override // com.rabbitmq.client.a.f.e
            public String V() {
                return this.f265382a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(known-hosts=");
                sb2.append(this.f265382a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.r(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.l(this.f265382a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    C1839e c1839e = (C1839e) obj;
                    String str = this.f265382a;
                    return str == null ? c1839e.f265382a == null : str.equals(c1839e.f265382a);
                }
                return false;
            }

            public int hashCode() {
                String str = this.f265382a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.open-ok";
            }

            public C1839e(z0 z0Var) throws IOException {
                this(z0Var.h());
            }
        }

        public static class f extends y0 implements com.rabbitmq.client.a.f.InterfaceC1795f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265383b = 20;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.rabbitmq.client.k0 f265384a;

            public f(com.rabbitmq.client.k0 k0Var) {
                if (k0Var == null) {
                    throw new IllegalStateException("Invalid configuration: 'challenge' must be non-null.");
                }
                this.f265384a = k0Var;
            }

            @Override // com.rabbitmq.client.a.f.InterfaceC1795f
            public com.rabbitmq.client.k0 E() {
                return this.f265384a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 20;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(challenge=");
                sb2.append(this.f265384a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.g0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.g(this.f265384a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    f fVar = (f) obj;
                    com.rabbitmq.client.k0 k0Var = this.f265384a;
                    return k0Var == null ? fVar.f265384a == null : k0Var.equals(fVar.f265384a);
                }
                return false;
            }

            public int hashCode() {
                com.rabbitmq.client.k0 k0Var = this.f265384a;
                if (k0Var != null) {
                    return k0Var.hashCode();
                }
                return 0;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.secure";
            }

            public f(z0 z0Var) throws IOException {
                this(z0Var.e());
            }
        }

        public static class g extends y0 implements com.rabbitmq.client.a.f.g {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f265385b = 21;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.rabbitmq.client.k0 f265386a;

            public g(com.rabbitmq.client.k0 k0Var) {
                if (k0Var == null) {
                    throw new IllegalStateException("Invalid configuration: 'response' must be non-null.");
                }
                this.f265386a = k0Var;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 21;
            }

            @Override // com.rabbitmq.client.a.f.g
            public com.rabbitmq.client.k0 N() {
                return this.f265386a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(response=");
                sb2.append(this.f265386a);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.I(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.g(this.f265386a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                g gVar = (g) obj;
                com.rabbitmq.client.k0 k0Var = this.f265386a;
                if (k0Var != null) {
                    if (!k0Var.equals(gVar.f265386a)) {
                    }
                }
                return gVar.f265386a == null;
            }

            public int hashCode() {
                com.rabbitmq.client.k0 k0Var = this.f265386a;
                if (k0Var != null) {
                    return k0Var.hashCode();
                }
                return 0;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.secure-ok";
            }

            public g(z0 z0Var) throws IOException {
                this(z0Var.e());
            }
        }

        public static class j extends y0 implements com.rabbitmq.client.a.f.j {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f265398d = 30;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265399a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f265400b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f265401c;

            public j(int i10, int i11, int i12) {
                this.f265399a = i10;
                this.f265400b = i11;
                this.f265401c = i12;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 30;
            }

            @Override // com.rabbitmq.client.a.f.j
            public int O() {
                return this.f265400b;
            }

            @Override // com.rabbitmq.client.a.f.j
            public int U() {
                return this.f265399a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(channel-max=");
                sb2.append(this.f265399a);
                sb2.append(", frame-max=");
                sb2.append(this.f265400b);
                sb2.append(", heartbeat=");
                sb2.append(this.f265401c);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.j0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265399a);
                a1Var.e(this.f265400b);
                a1Var.k(this.f265401c);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                j jVar = (j) obj;
                return this.f265399a == jVar.f265399a && this.f265400b == jVar.f265400b && this.f265401c == jVar.f265401c;
            }

            public int hashCode() {
                return (((this.f265399a * 31) + this.f265400b) * 31) + this.f265401c;
            }

            @Override // com.rabbitmq.client.a.f.j
            public int m0() {
                return this.f265401c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.tune";
            }

            public j(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.c(), z0Var.g());
            }
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.impl.k$e$k, reason: collision with other inner class name */
        public static class C1840k extends y0 implements com.rabbitmq.client.a.f.k {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f265402d = 31;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265403a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f265404b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f265405c;

            public C1840k(int i10, int i11, int i12) {
                this.f265403a = i10;
                this.f265404b = i11;
                this.f265405c = i12;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 31;
            }

            @Override // com.rabbitmq.client.a.f.k
            public int O() {
                return this.f265404b;
            }

            @Override // com.rabbitmq.client.a.f.k
            public int U() {
                return this.f265403a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(channel-max=");
                sb2.append(this.f265403a);
                sb2.append(", frame-max=");
                sb2.append(this.f265404b);
                sb2.append(", heartbeat=");
                sb2.append(this.f265405c);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.w(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265403a);
                a1Var.e(this.f265404b);
                a1Var.k(this.f265405c);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C1840k c1840k = (C1840k) obj;
                return this.f265403a == c1840k.f265403a && this.f265404b == c1840k.f265404b && this.f265405c == c1840k.f265405c;
            }

            public int hashCode() {
                return (((this.f265403a * 31) + this.f265404b) * 31) + this.f265405c;
            }

            @Override // com.rabbitmq.client.a.f.k
            public int m0() {
                return this.f265405c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.tune-ok";
            }

            public C1840k(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.c(), z0Var.g());
            }
        }

        public static class m extends y0 implements com.rabbitmq.client.a.f.m {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f265407c = 70;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.rabbitmq.client.k0 f265408a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265409b;

            public m(com.rabbitmq.client.k0 k0Var, String str) {
                if (k0Var == null) {
                    throw new IllegalStateException("Invalid configuration: 'newSecret' must be non-null.");
                }
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'reason' must be non-null.");
                }
                this.f265408a = k0Var;
                this.f265409b = str;
            }

            @Override // com.rabbitmq.client.a.f.m
            public com.rabbitmq.client.k0 F() {
                return this.f265408a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 70;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(new-secret=");
                sb2.append(this.f265408a);
                sb2.append(", reason=");
                sb2.append(this.f265409b);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.U(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.g(this.f265408a);
                a1Var.l(this.f265409b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    m mVar = (m) obj;
                    com.rabbitmq.client.k0 k0Var = this.f265408a;
                    if (k0Var == null ? mVar.f265408a != null : !k0Var.equals(mVar.f265408a)) {
                        return false;
                    }
                    String str = this.f265409b;
                    return str == null ? mVar.f265409b == null : str.equals(mVar.f265409b);
                }
                return false;
            }

            public int hashCode() {
                com.rabbitmq.client.k0 k0Var = this.f265408a;
                int iHashCode = (k0Var != null ? k0Var.hashCode() : 0) * 31;
                String str = this.f265409b;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.a.f.m
            public String u0() {
                return this.f265409b;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.update-secret";
            }

            public m(z0 z0Var) throws IOException {
                this(z0Var.e(), z0Var.h());
            }
        }

        public static class b extends y0 implements com.rabbitmq.client.a.f.b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f265371e = 50;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265372a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265373b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f265374c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final int f265375d;

            public b(int i10, String str, int i11, int i12) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'replyText' must be non-null.");
                }
                this.f265372a = i10;
                this.f265373b = str;
                this.f265374c = i11;
                this.f265375d = i12;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 50;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(reply-code=");
                sb2.append(this.f265372a);
                sb2.append(", reply-text=");
                sb2.append(this.f265373b);
                sb2.append(", class-id=");
                sb2.append(this.f265374c);
                sb2.append(", method-id=");
                sb2.append(this.f265375d);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.m0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265372a);
                a1Var.l(this.f265373b);
                a1Var.k(this.f265374c);
                a1Var.k(this.f265375d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
            
                if (r6.f265373b != null) goto L21;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r6) {
                /*
                    r5 = this;
                    r4 = 1
                    r0 = 1
                    if (r5 != r6) goto L6
                    r4 = 1
                    return r0
                L6:
                    r4 = 1
                    r1 = 0
                    r4 = 3
                    if (r6 == 0) goto L49
                    java.lang.Class r2 = r5.getClass()
                    r4 = 2
                    java.lang.Class r3 = r6.getClass()
                    r4 = 4
                    if (r2 == r3) goto L18
                    goto L49
                L18:
                    com.rabbitmq.client.impl.k$e$b r6 = (com.rabbitmq.client.impl.k.e.b) r6
                    int r2 = r5.f265372a
                    r4 = 4
                    int r3 = r6.f265372a
                    r4 = 4
                    if (r2 == r3) goto L23
                    return r1
                L23:
                    r4 = 4
                    java.lang.String r2 = r5.f265373b
                    if (r2 == 0) goto L33
                    java.lang.String r3 = r6.f265373b
                    r4 = 5
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L38
                    r4 = 0
                    goto L37
                L33:
                    java.lang.String r2 = r6.f265373b
                    if (r2 == 0) goto L38
                L37:
                    return r1
                L38:
                    int r2 = r5.f265374c
                    int r3 = r6.f265374c
                    if (r2 == r3) goto L3f
                    return r1
                L3f:
                    r4 = 1
                    int r5 = r5.f265375d
                    int r6 = r6.f265375d
                    r4 = 7
                    if (r5 == r6) goto L48
                    return r1
                L48:
                    return r0
                L49:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.e.b.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                int i10 = this.f265372a * 31;
                String str = this.f265373b;
                return ((((i10 + (str != null ? str.hashCode() : 0)) * 31) + this.f265374c) * 31) + this.f265375d;
            }

            @Override // com.rabbitmq.client.a.f.b
            public String m() {
                return this.f265373b;
            }

            @Override // com.rabbitmq.client.a.f.b
            public int n() {
                return this.f265372a;
            }

            @Override // com.rabbitmq.client.a.f.b
            public int o1() {
                return this.f265374c;
            }

            @Override // com.rabbitmq.client.a.f.b
            public int p1() {
                return this.f265375d;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.close";
            }

            public b(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.g(), z0Var.g());
            }
        }

        public static class d extends y0 implements com.rabbitmq.client.a.f.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f265377d = 40;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f265378a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265379b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f265380c;

            public d(String str, String str2, boolean z10) {
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'capabilities' must be non-null.");
                }
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'virtualHost' must be non-null.");
                }
                this.f265378a = str;
                this.f265379b = str2;
                this.f265380c = z10;
            }

            @Override // com.rabbitmq.client.a.f.d
            public boolean A() {
                return this.f265380c;
            }

            @Override // com.rabbitmq.client.a.f.d
            public String G() {
                return this.f265378a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(virtual-host=");
                sb2.append(this.f265378a);
                sb2.append(", capabilities=");
                sb2.append(this.f265379b);
                sb2.append(", insist=");
                sb2.append(this.f265380c);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.R(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.l(this.f265378a);
                a1Var.l(this.f265379b);
                a1Var.d(this.f265380c);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
            
                if (r6.f265378a != null) goto L17;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r6) {
                /*
                    r5 = this;
                    r0 = 1
                    if (r5 != r6) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r6 == 0) goto L45
                    java.lang.Class r2 = r5.getClass()
                    r4 = 3
                    java.lang.Class r3 = r6.getClass()
                    r4 = 4
                    if (r2 == r3) goto L14
                    goto L45
                L14:
                    com.rabbitmq.client.impl.k$e$d r6 = (com.rabbitmq.client.impl.k.e.d) r6
                    java.lang.String r2 = r5.f265378a
                    if (r2 == 0) goto L25
                    r4 = 0
                    java.lang.String r3 = r6.f265378a
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2a
                    r4 = 0
                    goto L29
                L25:
                    java.lang.String r2 = r6.f265378a
                    if (r2 == 0) goto L2a
                L29:
                    return r1
                L2a:
                    java.lang.String r2 = r5.f265379b
                    if (r2 == 0) goto L37
                    java.lang.String r3 = r6.f265379b
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L3d
                    goto L3c
                L37:
                    java.lang.String r2 = r6.f265379b
                    r4 = 5
                    if (r2 == 0) goto L3d
                L3c:
                    return r1
                L3d:
                    boolean r5 = r5.f265380c
                    boolean r6 = r6.f265380c
                    if (r5 == r6) goto L44
                    return r1
                L44:
                    return r0
                L45:
                    r4 = 1
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.e.d.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f265378a;
                int iHashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f265379b;
                return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f265380c ? 1 : 0);
            }

            @Override // com.rabbitmq.client.a.f.d
            public String p() {
                return this.f265379b;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.open";
            }

            public d(z0 z0Var) throws IOException {
                this(z0Var.h(), z0Var.h(), z0Var.b());
            }
        }

        public static class h extends y0 implements com.rabbitmq.client.a.f.h {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f265387f = 10;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265388a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f265389b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Map<String, Object> f265390c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final com.rabbitmq.client.k0 f265391d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final com.rabbitmq.client.k0 f265392e;

            public h(int i10, int i11, Map<String, Object> map, com.rabbitmq.client.k0 k0Var, com.rabbitmq.client.k0 k0Var2) {
                if (k0Var2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'locales' must be non-null.");
                }
                if (k0Var == null) {
                    throw new IllegalStateException("Invalid configuration: 'mechanisms' must be non-null.");
                }
                this.f265388a = i10;
                this.f265389b = i11;
                this.f265390c = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
                this.f265391d = k0Var;
                this.f265392e = k0Var2;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 10;
            }

            @Override // com.rabbitmq.client.a.f.h
            public Map<String, Object> S0() {
                return this.f265390c;
            }

            @Override // com.rabbitmq.client.a.f.h
            public com.rabbitmq.client.k0 T0() {
                return this.f265391d;
            }

            @Override // com.rabbitmq.client.a.f.h
            public int U0() {
                return this.f265389b;
            }

            @Override // com.rabbitmq.client.a.f.h
            public int V0() {
                return this.f265388a;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.a.f.h
            public com.rabbitmq.client.k0 W0() {
                return this.f265392e;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(version-major=");
                sb2.append(this.f265388a);
                sb2.append(", version-minor=");
                sb2.append(this.f265389b);
                sb2.append(", server-properties=");
                sb2.append(this.f265390c);
                sb2.append(", mechanisms=");
                sb2.append(this.f265391d);
                sb2.append(", locales=");
                sb2.append(this.f265392e);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.k(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.j(this.f265388a);
                a1Var.j(this.f265389b);
                a1Var.m(this.f265390c);
                a1Var.g(this.f265391d);
                a1Var.g(this.f265392e);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                h hVar = (h) obj;
                if (this.f265388a != hVar.f265388a || this.f265389b != hVar.f265389b) {
                    return false;
                }
                Map<String, Object> map = this.f265390c;
                if (map == null ? hVar.f265390c != null : !map.equals(hVar.f265390c)) {
                    return false;
                }
                com.rabbitmq.client.k0 k0Var = this.f265391d;
                if (k0Var == null ? hVar.f265391d != null : !k0Var.equals(hVar.f265391d)) {
                    return false;
                }
                com.rabbitmq.client.k0 k0Var2 = this.f265392e;
                return k0Var2 == null ? hVar.f265392e == null : k0Var2.equals(hVar.f265392e);
            }

            public int hashCode() {
                int i10 = ((this.f265388a * 31) + this.f265389b) * 31;
                Map<String, Object> map = this.f265390c;
                int iHashCode = (i10 + (map != null ? map.hashCode() : 0)) * 31;
                com.rabbitmq.client.k0 k0Var = this.f265391d;
                int iHashCode2 = (iHashCode + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
                com.rabbitmq.client.k0 k0Var2 = this.f265392e;
                return iHashCode2 + (k0Var2 != null ? k0Var2.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.start";
            }

            public h(z0 z0Var) throws IOException {
                this(z0Var.f(), z0Var.f(), z0Var.i(), z0Var.e(), z0Var.e());
            }
        }

        public static class i extends y0 implements com.rabbitmq.client.a.f.i {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f265393e = 11;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Map<String, Object> f265394a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265395b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final com.rabbitmq.client.k0 f265396c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f265397d;

            public i(Map<String, Object> map, String str, com.rabbitmq.client.k0 k0Var, String str2) {
                Map<String, Object> mapUnmodifiableMap;
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'locale' must be non-null.");
                }
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'mechanism' must be non-null.");
                }
                if (k0Var == null) {
                    throw new IllegalStateException("Invalid configuration: 'response' must be non-null.");
                }
                if (map == null) {
                    mapUnmodifiableMap = null;
                    int i10 = 7 >> 0;
                } else {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(map));
                }
                this.f265394a = mapUnmodifiableMap;
                this.f265395b = str;
                this.f265396c = k0Var;
                this.f265397d = str2;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 11;
            }

            @Override // com.rabbitmq.client.a.f.i
            public com.rabbitmq.client.k0 N() {
                return this.f265396c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 10;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(client-properties=");
                sb2.append(this.f265394a);
                sb2.append(", mechanism=");
                sb2.append(this.f265395b);
                sb2.append(", response=");
                sb2.append(this.f265396c);
                sb2.append(", locale=");
                sb2.append(this.f265397d);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.a.f.i
            public Map<String, Object> X0() {
                return this.f265394a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.f.i
            public String Y0() {
                return this.f265395b;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.f(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.m(this.f265394a);
                a1Var.l(this.f265395b);
                a1Var.g(this.f265396c);
                a1Var.l(this.f265397d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
            
                if (r6.f265396c != null) goto L35;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r6) {
                /*
                    r5 = this;
                    r0 = 1
                    r4 = r0
                    if (r5 != r6) goto L6
                    r4 = 1
                    return r0
                L6:
                    r1 = 0
                    if (r6 == 0) goto L6b
                    java.lang.Class r2 = r5.getClass()
                    java.lang.Class r3 = r6.getClass()
                    if (r2 == r3) goto L14
                    goto L6b
                L14:
                    r4 = 4
                    com.rabbitmq.client.impl.k$e$i r6 = (com.rabbitmq.client.impl.k.e.i) r6
                    r4 = 4
                    java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f265394a
                    if (r2 == 0) goto L26
                    java.util.Map<java.lang.String, java.lang.Object> r3 = r6.f265394a
                    boolean r2 = r2.equals(r3)
                    r4 = 0
                    if (r2 != 0) goto L2c
                    goto L2a
                L26:
                    java.util.Map<java.lang.String, java.lang.Object> r2 = r6.f265394a
                    if (r2 == 0) goto L2c
                L2a:
                    r4 = 7
                    return r1
                L2c:
                    r4 = 4
                    java.lang.String r2 = r5.f265395b
                    if (r2 == 0) goto L3a
                    java.lang.String r3 = r6.f265395b
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L40
                    goto L3f
                L3a:
                    java.lang.String r2 = r6.f265395b
                    r4 = 2
                    if (r2 == 0) goto L40
                L3f:
                    return r1
                L40:
                    com.rabbitmq.client.k0 r2 = r5.f265396c
                    r4 = 4
                    if (r2 == 0) goto L4f
                    com.rabbitmq.client.k0 r3 = r6.f265396c
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L55
                    r4 = 2
                    goto L53
                L4f:
                    com.rabbitmq.client.k0 r2 = r6.f265396c
                    if (r2 == 0) goto L55
                L53:
                    r4 = 3
                    return r1
                L55:
                    java.lang.String r5 = r5.f265397d
                    r4 = 2
                    if (r5 == 0) goto L64
                    java.lang.String r6 = r6.f265397d
                    boolean r5 = r5.equals(r6)
                    r4 = 0
                    if (r5 != 0) goto L6a
                    goto L68
                L64:
                    java.lang.String r5 = r6.f265397d
                    if (r5 == 0) goto L6a
                L68:
                    r4 = 6
                    return r1
                L6a:
                    return r0
                L6b:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.e.i.equals(java.lang.Object):boolean");
            }

            @Override // com.rabbitmq.client.a.f.i
            public String getLocale() {
                return this.f265397d;
            }

            public int hashCode() {
                Map<String, Object> map = this.f265394a;
                int iHashCode = (map != null ? map.hashCode() : 0) * 31;
                String str = this.f265395b;
                int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
                com.rabbitmq.client.k0 k0Var = this.f265396c;
                int iHashCode3 = (iHashCode2 + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
                String str2 = this.f265397d;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "connection.start-ok";
            }

            public i(z0 z0Var) throws IOException {
                this(z0Var.i(), z0Var.h(), z0Var.e(), z0Var.h());
            }
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f265411a = 40;

        public static class b extends y0 implements com.rabbitmq.client.a.g.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265419a = 31;

            public b() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 31;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.X(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "exchange.bind-ok";
            }

            public b(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class d extends y0 implements com.rabbitmq.client.a.g.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265430a = 11;

            public d() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 11;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.e0(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "exchange.declare-ok";
            }

            public d(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class f extends y0 implements com.rabbitmq.client.a.g.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265436a = 21;

            public f() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 21;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.o(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "exchange.delete-ok";
            }

            public f(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class h extends y0 implements com.rabbitmq.client.a.g.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f265444a = 51;

            public h() {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 51;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("()");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.F(this);
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "exchange.unbind-ok";
            }

            public h(z0 z0Var) throws IOException {
                this();
            }
        }

        public static class e extends y0 implements com.rabbitmq.client.a.g.e {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f265431e = 20;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265432a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265433b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f265434c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f265435d;

            public e(int i10, String str, boolean z10, boolean z11) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'exchange' must be non-null.");
                }
                this.f265432a = i10;
                this.f265433b = str;
                this.f265434c = z10;
                this.f265435d = z11;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 20;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265432a);
                sb2.append(", exchange=");
                sb2.append(this.f265433b);
                sb2.append(", if-unused=");
                sb2.append(this.f265434c);
                sb2.append(", nowait=");
                sb2.append(this.f265435d);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.g.e
            public int a() {
                return this.f265432a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.N(this);
            }

            @Override // com.rabbitmq.client.a.g.e
            public boolean b() {
                return this.f265435d;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265432a);
                a1Var.l(this.f265433b);
                a1Var.d(this.f265434c);
                a1Var.d(this.f265435d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
            
                if (r6.f265433b != null) goto L20;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r6) {
                /*
                    r5 = this;
                    r0 = 1
                    if (r5 != r6) goto L4
                    return r0
                L4:
                    r4 = 0
                    r1 = 0
                    if (r6 == 0) goto L4a
                    java.lang.Class r2 = r5.getClass()
                    r4 = 6
                    java.lang.Class r3 = r6.getClass()
                    r4 = 3
                    if (r2 == r3) goto L16
                    r4 = 7
                    goto L4a
                L16:
                    r4 = 4
                    com.rabbitmq.client.impl.k$g$e r6 = (com.rabbitmq.client.impl.k.g.e) r6
                    int r2 = r5.f265432a
                    int r3 = r6.f265432a
                    if (r2 == r3) goto L20
                    return r1
                L20:
                    java.lang.String r2 = r5.f265433b
                    if (r2 == 0) goto L2f
                    java.lang.String r3 = r6.f265433b
                    boolean r2 = r2.equals(r3)
                    r4 = 5
                    if (r2 != 0) goto L35
                    r4 = 0
                    goto L34
                L2f:
                    r4 = 1
                    java.lang.String r2 = r6.f265433b
                    if (r2 == 0) goto L35
                L34:
                    return r1
                L35:
                    r4 = 6
                    boolean r2 = r5.f265434c
                    r4 = 4
                    boolean r3 = r6.f265434c
                    if (r2 == r3) goto L3f
                    r4 = 3
                    return r1
                L3f:
                    r4 = 6
                    boolean r5 = r5.f265435d
                    r4 = 2
                    boolean r6 = r6.f265435d
                    if (r5 == r6) goto L48
                    return r1
                L48:
                    r4 = 6
                    return r0
                L4a:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.g.e.equals(java.lang.Object):boolean");
            }

            @Override // com.rabbitmq.client.a.g.e
            public String f() {
                return this.f265433b;
            }

            public int hashCode() {
                int i10 = this.f265432a * 31;
                String str = this.f265433b;
                return ((((i10 + (str != null ? str.hashCode() : 0)) * 31) + (this.f265434c ? 1 : 0)) * 31) + (this.f265435d ? 1 : 0);
            }

            @Override // com.rabbitmq.client.a.g.e
            public boolean v() {
                return this.f265434c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "exchange.delete";
            }

            public e(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.b(), z0Var.b());
            }
        }

        public static class a extends y0 implements com.rabbitmq.client.a.g.InterfaceC1805a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f265412g = 30;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265414b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f265415c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f265416d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final boolean f265417e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Map<String, Object> f265418f;

            public a(int i10, String str, String str2, String str3, boolean z10, Map<String, Object> map) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'destination' must be non-null.");
                }
                if (str3 == null) {
                    throw new IllegalStateException("Invalid configuration: 'routingKey' must be non-null.");
                }
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'source' must be non-null.");
                }
                this.f265413a = i10;
                this.f265414b = str;
                this.f265415c = str2;
                this.f265416d = str3;
                this.f265417e = z10;
                this.f265418f = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 30;
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1805a
            public String P() {
                return this.f265415c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265413a);
                sb2.append(", destination=");
                sb2.append(this.f265414b);
                sb2.append(", source=");
                sb2.append(this.f265415c);
                sb2.append(", routing-key=");
                sb2.append(this.f265416d);
                sb2.append(", nowait=");
                sb2.append(this.f265417e);
                sb2.append(", arguments=");
                sb2.append(this.f265418f);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1805a
            public int a() {
                return this.f265413a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.J(this);
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1805a
            public boolean b() {
                return this.f265417e;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265413a);
                a1Var.l(this.f265414b);
                a1Var.l(this.f265415c);
                a1Var.l(this.f265416d);
                a1Var.d(this.f265417e);
                a1Var.m(this.f265418f);
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1805a
            public Map<String, Object> d() {
                return this.f265418f;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
            
                if (r6.f265414b != null) goto L21;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r6) {
                /*
                    r5 = this;
                    r4 = 3
                    r0 = 1
                    if (r5 != r6) goto L5
                    return r0
                L5:
                    r1 = 0
                    if (r6 == 0) goto L78
                    java.lang.Class r2 = r5.getClass()
                    java.lang.Class r3 = r6.getClass()
                    if (r2 == r3) goto L14
                    r4 = 5
                    goto L78
                L14:
                    com.rabbitmq.client.impl.k$g$a r6 = (com.rabbitmq.client.impl.k.g.a) r6
                    int r2 = r5.f265413a
                    r4 = 7
                    int r3 = r6.f265413a
                    if (r2 == r3) goto L1f
                    r4 = 3
                    return r1
                L1f:
                    java.lang.String r2 = r5.f265414b
                    if (r2 == 0) goto L2e
                    r4 = 1
                    java.lang.String r3 = r6.f265414b
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L33
                    r4 = 7
                    goto L32
                L2e:
                    java.lang.String r2 = r6.f265414b
                    if (r2 == 0) goto L33
                L32:
                    return r1
                L33:
                    java.lang.String r2 = r5.f265415c
                    r4 = 4
                    if (r2 == 0) goto L42
                    java.lang.String r3 = r6.f265415c
                    boolean r2 = r2.equals(r3)
                    r4 = 7
                    if (r2 != 0) goto L47
                    goto L46
                L42:
                    java.lang.String r2 = r6.f265415c
                    if (r2 == 0) goto L47
                L46:
                    return r1
                L47:
                    r4 = 5
                    java.lang.String r2 = r5.f265416d
                    r4 = 2
                    if (r2 == 0) goto L57
                    java.lang.String r3 = r6.f265416d
                    boolean r2 = r2.equals(r3)
                    r4 = 2
                    if (r2 != 0) goto L5d
                    goto L5c
                L57:
                    java.lang.String r2 = r6.f265416d
                    r4 = 2
                    if (r2 == 0) goto L5d
                L5c:
                    return r1
                L5d:
                    boolean r2 = r5.f265417e
                    boolean r3 = r6.f265417e
                    if (r2 == r3) goto L64
                    return r1
                L64:
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f265418f
                    if (r5 == 0) goto L72
                    r4 = 5
                    java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f265418f
                    boolean r5 = r5.equals(r6)
                    if (r5 != 0) goto L77
                    goto L76
                L72:
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r6.f265418f
                    if (r5 == 0) goto L77
                L76:
                    return r1
                L77:
                    return r0
                L78:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.g.a.equals(java.lang.Object):boolean");
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1805a
            public String g() {
                return this.f265416d;
            }

            public int hashCode() {
                int i10 = this.f265413a * 31;
                String str = this.f265414b;
                int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f265415c;
                int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f265416d;
                int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f265417e ? 1 : 0)) * 31;
                Map<String, Object> map = this.f265418f;
                return iHashCode3 + (map != null ? map.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1805a
            public String q1() {
                return this.f265414b;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "exchange.bind";
            }

            public a(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.h(), z0Var.h(), z0Var.b(), z0Var.i());
            }
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.impl.k$g$g, reason: collision with other inner class name */
        public static class C1841g extends y0 implements com.rabbitmq.client.a.g.InterfaceC1812g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f265437g = 40;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265438a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265439b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f265440c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f265441d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final boolean f265442e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Map<String, Object> f265443f;

            public C1841g(int i10, String str, String str2, String str3, boolean z10, Map<String, Object> map) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'destination' must be non-null.");
                }
                if (str3 == null) {
                    throw new IllegalStateException("Invalid configuration: 'routingKey' must be non-null.");
                }
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'source' must be non-null.");
                }
                this.f265438a = i10;
                this.f265439b = str;
                this.f265440c = str2;
                this.f265441d = str3;
                this.f265442e = z10;
                this.f265443f = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 40;
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1812g
            public String P() {
                return this.f265440c;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265438a);
                sb2.append(", destination=");
                sb2.append(this.f265439b);
                sb2.append(", source=");
                sb2.append(this.f265440c);
                sb2.append(", routing-key=");
                sb2.append(this.f265441d);
                sb2.append(", nowait=");
                sb2.append(this.f265442e);
                sb2.append(", arguments=");
                sb2.append(this.f265443f);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1812g
            public int a() {
                return this.f265438a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.s(this);
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1812g
            public boolean b() {
                return this.f265442e;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265438a);
                a1Var.l(this.f265439b);
                a1Var.l(this.f265440c);
                a1Var.l(this.f265441d);
                a1Var.d(this.f265442e);
                a1Var.m(this.f265443f);
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1812g
            public Map<String, Object> d() {
                return this.f265443f;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
            
                if (r6.f265440c != null) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
            
                if (r6.f265441d != null) goto L38;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r6) {
                /*
                    r5 = this;
                    r4 = 7
                    r0 = 1
                    if (r5 != r6) goto L6
                    r4 = 7
                    return r0
                L6:
                    r4 = 2
                    r1 = 0
                    if (r6 == 0) goto L7f
                    r4 = 0
                    java.lang.Class r2 = r5.getClass()
                    r4 = 6
                    java.lang.Class r3 = r6.getClass()
                    if (r2 == r3) goto L17
                    goto L7f
                L17:
                    com.rabbitmq.client.impl.k$g$g r6 = (com.rabbitmq.client.impl.k.g.C1841g) r6
                    int r2 = r5.f265438a
                    int r3 = r6.f265438a
                    if (r2 == r3) goto L20
                    return r1
                L20:
                    java.lang.String r2 = r5.f265439b
                    if (r2 == 0) goto L2e
                    java.lang.String r3 = r6.f265439b
                    boolean r2 = r2.equals(r3)
                    r4 = 4
                    if (r2 != 0) goto L33
                    goto L32
                L2e:
                    java.lang.String r2 = r6.f265439b
                    if (r2 == 0) goto L33
                L32:
                    return r1
                L33:
                    r4 = 4
                    java.lang.String r2 = r5.f265440c
                    if (r2 == 0) goto L43
                    java.lang.String r3 = r6.f265440c
                    boolean r2 = r2.equals(r3)
                    r4 = 5
                    if (r2 != 0) goto L4a
                    r4 = 2
                    goto L48
                L43:
                    r4 = 0
                    java.lang.String r2 = r6.f265440c
                    if (r2 == 0) goto L4a
                L48:
                    r4 = 4
                    return r1
                L4a:
                    java.lang.String r2 = r5.f265441d
                    if (r2 == 0) goto L59
                    r4 = 0
                    java.lang.String r3 = r6.f265441d
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L5f
                    r4 = 3
                    goto L5e
                L59:
                    java.lang.String r2 = r6.f265441d
                    r4 = 0
                    if (r2 == 0) goto L5f
                L5e:
                    return r1
                L5f:
                    r4 = 5
                    boolean r2 = r5.f265442e
                    boolean r3 = r6.f265442e
                    if (r2 == r3) goto L67
                    return r1
                L67:
                    r4 = 3
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f265443f
                    if (r5 == 0) goto L77
                    r4 = 4
                    java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f265443f
                    boolean r5 = r5.equals(r6)
                    r4 = 4
                    if (r5 != 0) goto L7e
                    goto L7d
                L77:
                    r4 = 5
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r6.f265443f
                    r4 = 2
                    if (r5 == 0) goto L7e
                L7d:
                    return r1
                L7e:
                    return r0
                L7f:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.g.C1841g.equals(java.lang.Object):boolean");
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1812g
            public String g() {
                return this.f265441d;
            }

            public int hashCode() {
                int i10 = this.f265438a * 31;
                String str = this.f265439b;
                int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f265440c;
                int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f265441d;
                int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f265442e ? 1 : 0)) * 31;
                Map<String, Object> map = this.f265443f;
                return iHashCode3 + (map != null ? map.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.a.g.InterfaceC1812g
            public String q1() {
                return this.f265439b;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "exchange.unbind";
            }

            public C1841g(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.h(), z0Var.h(), z0Var.b(), z0Var.i());
            }
        }

        public static class c extends y0 implements com.rabbitmq.client.a.g.c {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f265420j = 10;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f265421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f265422b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f265423c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f265424d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final boolean f265425e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final boolean f265426f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final boolean f265427g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final boolean f265428h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Map<String, Object> f265429i;

            public c(int i10, String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Map<String, Object> map) {
                if (str == null) {
                    throw new IllegalStateException("Invalid configuration: 'exchange' must be non-null.");
                }
                if (str2 == null) {
                    throw new IllegalStateException("Invalid configuration: 'type' must be non-null.");
                }
                this.f265421a = i10;
                this.f265422b = str;
                this.f265423c = str2;
                this.f265424d = z10;
                this.f265425e = z11;
                this.f265426f = z12;
                this.f265427g = z13;
                this.f265428h = z14;
                this.f265429i = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int J() {
                return 10;
            }

            @Override // com.rabbitmq.client.a.g.c
            public boolean S() {
                return this.f265427g;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public int W() {
                return 40;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void X(StringBuilder sb2) {
                sb2.append("(ticket=");
                sb2.append(this.f265421a);
                sb2.append(", exchange=");
                sb2.append(this.f265422b);
                sb2.append(", type=");
                sb2.append(this.f265423c);
                sb2.append(", passive=");
                sb2.append(this.f265424d);
                sb2.append(", durable=");
                sb2.append(this.f265425e);
                sb2.append(", auto-delete=");
                sb2.append(this.f265426f);
                sb2.append(", internal=");
                sb2.append(this.f265427g);
                sb2.append(", nowait=");
                sb2.append(this.f265428h);
                sb2.append(", arguments=");
                sb2.append(this.f265429i);
                sb2.append(")");
            }

            @Override // com.rabbitmq.client.impl.y0
            public boolean Y() {
                return false;
            }

            @Override // com.rabbitmq.client.a.g.c
            public int a() {
                return this.f265421a;
            }

            @Override // com.rabbitmq.client.impl.y0
            public Object a0(h hVar) throws IOException {
                return hVar.n(this);
            }

            @Override // com.rabbitmq.client.a.g.c
            public boolean b() {
                return this.f265428h;
            }

            @Override // com.rabbitmq.client.impl.y0
            public void b0(a1 a1Var) throws IOException {
                a1Var.k(this.f265421a);
                a1Var.l(this.f265422b);
                a1Var.l(this.f265423c);
                a1Var.d(this.f265424d);
                a1Var.d(this.f265425e);
                a1Var.d(this.f265426f);
                a1Var.d(this.f265427g);
                a1Var.d(this.f265428h);
                a1Var.m(this.f265429i);
            }

            @Override // com.rabbitmq.client.a.g.c
            public String c() {
                return this.f265423c;
            }

            @Override // com.rabbitmq.client.a.g.c
            public Map<String, Object> d() {
                return this.f265429i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:52:0x0080, code lost:
            
                if (r6.f265429i != null) goto L53;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r6) {
                /*
                    r5 = this;
                    r4 = 0
                    r0 = 1
                    if (r5 != r6) goto L6
                    r4 = 4
                    return r0
                L6:
                    r1 = 0
                    r1 = 0
                    if (r6 == 0) goto L85
                    java.lang.Class r2 = r5.getClass()
                    java.lang.Class r3 = r6.getClass()
                    if (r2 == r3) goto L15
                    goto L85
                L15:
                    com.rabbitmq.client.impl.k$g$c r6 = (com.rabbitmq.client.impl.k.g.c) r6
                    int r2 = r5.f265421a
                    r4 = 7
                    int r3 = r6.f265421a
                    if (r2 == r3) goto L1f
                    return r1
                L1f:
                    java.lang.String r2 = r5.f265422b
                    if (r2 == 0) goto L2d
                    r4 = 6
                    java.lang.String r3 = r6.f265422b
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L33
                    goto L32
                L2d:
                    java.lang.String r2 = r6.f265422b
                    r4 = 5
                    if (r2 == 0) goto L33
                L32:
                    return r1
                L33:
                    java.lang.String r2 = r5.f265423c
                    if (r2 == 0) goto L41
                    java.lang.String r3 = r6.f265423c
                    boolean r2 = r2.equals(r3)
                    r4 = 2
                    if (r2 != 0) goto L47
                    goto L46
                L41:
                    java.lang.String r2 = r6.f265423c
                    r4 = 4
                    if (r2 == 0) goto L47
                L46:
                    return r1
                L47:
                    boolean r2 = r5.f265424d
                    boolean r3 = r6.f265424d
                    if (r2 == r3) goto L4e
                    return r1
                L4e:
                    r4 = 1
                    boolean r2 = r5.f265425e
                    r4 = 5
                    boolean r3 = r6.f265425e
                    if (r2 == r3) goto L57
                    return r1
                L57:
                    boolean r2 = r5.f265426f
                    r4 = 7
                    boolean r3 = r6.f265426f
                    if (r2 == r3) goto L5f
                    return r1
                L5f:
                    r4 = 0
                    boolean r2 = r5.f265427g
                    r4 = 4
                    boolean r3 = r6.f265427g
                    if (r2 == r3) goto L68
                    return r1
                L68:
                    boolean r2 = r5.f265428h
                    boolean r3 = r6.f265428h
                    if (r2 == r3) goto L70
                    r4 = 7
                    return r1
                L70:
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f265429i
                    if (r5 == 0) goto L7e
                    java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f265429i
                    boolean r5 = r5.equals(r6)
                    if (r5 != 0) goto L84
                    r4 = 2
                    goto L82
                L7e:
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r6.f265429i
                    if (r5 == 0) goto L84
                L82:
                    r4 = 6
                    return r1
                L84:
                    return r0
                L85:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.k.g.c.equals(java.lang.Object):boolean");
            }

            @Override // com.rabbitmq.client.a.g.c
            public String f() {
                return this.f265422b;
            }

            public int hashCode() {
                int i10 = this.f265421a * 31;
                String str = this.f265422b;
                int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f265423c;
                int iHashCode2 = (((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f265424d ? 1 : 0)) * 31) + (this.f265425e ? 1 : 0)) * 31) + (this.f265426f ? 1 : 0)) * 31) + (this.f265427g ? 1 : 0)) * 31) + (this.f265428h ? 1 : 0)) * 31;
                Map<String, Object> map = this.f265429i;
                return iHashCode2 + (map != null ? map.hashCode() : 0);
            }

            @Override // com.rabbitmq.client.a.g.c
            public boolean q() {
                return this.f265424d;
            }

            @Override // com.rabbitmq.client.a.g.c
            public boolean r() {
                return this.f265426f;
            }

            @Override // com.rabbitmq.client.a.g.c
            public boolean u() {
                return this.f265425e;
            }

            @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
            public String z() {
                return "exchange.declare";
            }

            public c(z0 z0Var) throws IOException {
                this(z0Var.g(), z0Var.h(), z0Var.h(), z0Var.b(), z0Var.b(), z0Var.b(), z0Var.b(), z0Var.b(), z0Var.i());
            }
        }
    }
}
