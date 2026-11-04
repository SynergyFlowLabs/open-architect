package rk;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC2474a f366661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f366662b;

    /* JADX INFO: renamed from: rk.a$a, reason: collision with other inner class name */
    public enum EnumC2474a {
        BIT_32,
        BIT_64,
        UNKNOWN;

        static {
            int i10 = 7 << 2;
        }
    }

    public enum b {
        X86,
        IA_64,
        PPC,
        UNKNOWN
    }

    public a(EnumC2474a enumC2474a, b bVar) {
        this.f366661a = enumC2474a;
        this.f366662b = bVar;
    }

    public EnumC2474a a() {
        return this.f366661a;
    }

    public b b() {
        return this.f366662b;
    }

    public boolean c() {
        return EnumC2474a.BIT_32.equals(this.f366661a);
    }

    public boolean d() {
        return EnumC2474a.BIT_64.equals(this.f366661a);
    }

    public boolean e() {
        return b.IA_64.equals(this.f366662b);
    }

    public boolean f() {
        return b.PPC.equals(this.f366662b);
    }

    public boolean g() {
        return b.X86.equals(this.f366662b);
    }
}
