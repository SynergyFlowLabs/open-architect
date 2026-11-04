package og;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class c extends io.ably.lib.objects.type.c {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Double f333632a;

        public a(@NotNull Double d10) {
            this.f333632a = d10;
        }

        @NotNull
        public Double a() {
            return this.f333632a;
        }
    }

    public c() {
        super(null);
    }

    @NotNull
    public a a() {
        return (a) this.f287485a;
    }

    public String toString() {
        if (this.f287485a == null) {
            return "LiveCounterUpdate{no change}";
        }
        return "LiveCounterUpdate{amount=" + a().a() + "}";
    }

    public c(@NotNull Double d10) {
        super(new a(d10));
    }
}
