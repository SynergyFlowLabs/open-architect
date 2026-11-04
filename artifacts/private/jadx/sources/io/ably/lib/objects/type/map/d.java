package io.ably.lib.objects.type.map;

import com.google.gson.i;
import com.google.gson.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d {

    private static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f287489a;

        a(byte[] bArr) {
            this.f287489a = bArr;
        }

        @Override // io.ably.lib.objects.type.map.d
        public byte[] a() {
            return this.f287489a;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public Object i() {
            return this.f287489a;
        }

        @Override // io.ably.lib.objects.type.map.d
        public boolean j() {
            return true;
        }
    }

    private static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Boolean f287490a;

        b(@NotNull Boolean bool) {
            this.f287490a = bool;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public Boolean b() {
            return this.f287490a;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public Object i() {
            return this.f287490a;
        }

        @Override // io.ably.lib.objects.type.map.d
        public boolean k() {
            return true;
        }
    }

    private static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f287491a;

        c(@NotNull i iVar) {
            this.f287491a = iVar;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public i c() {
            return this.f287491a;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public Object i() {
            return this.f287491a;
        }

        @Override // io.ably.lib.objects.type.map.d
        public boolean l() {
            return true;
        }
    }

    /* JADX INFO: renamed from: io.ably.lib.objects.type.map.d$d, reason: collision with other inner class name */
    private static final class C1932d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f287492a;

        C1932d(@NotNull o oVar) {
            this.f287492a = oVar;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public o d() {
            return this.f287492a;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public Object i() {
            return this.f287492a;
        }

        @Override // io.ably.lib.objects.type.map.d
        public boolean m() {
            return true;
        }
    }

    private static final class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final og.a f287493a;

        e(@NotNull og.a aVar) {
            this.f287493a = aVar;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public og.a e() {
            return this.f287493a;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public Object i() {
            return this.f287493a;
        }

        @Override // io.ably.lib.objects.type.map.d
        public boolean n() {
            return true;
        }
    }

    private static final class f extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.ably.lib.objects.type.map.a f287494a;

        f(@NotNull io.ably.lib.objects.type.map.a aVar) {
            this.f287494a = aVar;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public io.ably.lib.objects.type.map.a f() {
            return this.f287494a;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public Object i() {
            return this.f287494a;
        }

        @Override // io.ably.lib.objects.type.map.d
        public boolean o() {
            return true;
        }
    }

    private static final class g extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Number f287495a;

        g(@NotNull Number number) {
            this.f287495a = number;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public Number g() {
            return this.f287495a;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public Object i() {
            return this.f287495a;
        }

        @Override // io.ably.lib.objects.type.map.d
        public boolean p() {
            return true;
        }
    }

    private static final class h extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f287496a;

        h(@NotNull String str) {
            this.f287496a = str;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public String h() {
            return this.f287496a;
        }

        @Override // io.ably.lib.objects.type.map.d
        @NotNull
        public Object i() {
            return this.f287496a;
        }

        @Override // io.ably.lib.objects.type.map.d
        public boolean q() {
            return true;
        }
    }

    @NotNull
    public static d r(@NotNull i iVar) {
        return new c(iVar);
    }

    @NotNull
    public static d s(@NotNull o oVar) {
        return new C1932d(oVar);
    }

    @NotNull
    public static d t(@NotNull io.ably.lib.objects.type.map.a aVar) {
        return new f(aVar);
    }

    @NotNull
    public static d u(@NotNull Boolean bool) {
        return new b(bool);
    }

    @NotNull
    public static d v(@NotNull Number number) {
        return new g(number);
    }

    @NotNull
    public static d w(@NotNull String str) {
        return new h(str);
    }

    @NotNull
    public static d x(@NotNull og.a aVar) {
        return new e(aVar);
    }

    @NotNull
    public static d y(byte[] bArr) {
        return new a(bArr);
    }

    public byte[] a() {
        throw new IllegalStateException("Not a Binary value");
    }

    @NotNull
    public Boolean b() {
        throw new IllegalStateException("Not a Boolean value");
    }

    @NotNull
    public i c() {
        throw new IllegalStateException("Not a JsonArray value");
    }

    @NotNull
    public o d() {
        throw new IllegalStateException("Not a JsonObject value");
    }

    @NotNull
    public og.a e() {
        throw new IllegalStateException("Not a LiveCounter value");
    }

    @NotNull
    public io.ably.lib.objects.type.map.a f() {
        throw new IllegalStateException("Not a LiveMap value");
    }

    @NotNull
    public Number g() {
        throw new IllegalStateException("Not a Number value");
    }

    @NotNull
    public String h() {
        throw new IllegalStateException("Not a String value");
    }

    @NotNull
    public abstract Object i();

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }
}
