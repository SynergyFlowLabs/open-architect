package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f305392a;

    public ea(@NotNull n8 n8Var) {
        this.f305392a = (n8) io.sentry.util.y.c(n8Var, "options are required");
    }

    private boolean b(@NotNull Double d10, @NotNull Double d11) {
        return d10.doubleValue() >= d11.doubleValue();
    }

    @NotNull
    public fa a(@NotNull s4 s4Var) {
        Double dA;
        Double dA2;
        Double dC = s4Var.c();
        fa faVarL = s4Var.d().l();
        if (faVarL != null) {
            return io.sentry.util.d0.a(faVarL);
        }
        if (this.f305392a.getProfilesSampler() != null) {
            try {
                dA = this.f305392a.getProfilesSampler().a(s4Var);
            } catch (Throwable th2) {
                this.f305392a.getLogger().a(y7.ERROR, "Error in the 'ProfilesSamplerCallback' callback.", th2);
                dA = null;
            }
        } else {
            dA = null;
        }
        if (dA == null) {
            dA = this.f305392a.getProfilesSampleRate();
        }
        Double d10 = dA;
        Boolean boolValueOf = Boolean.valueOf(d10 != null && b(d10, dC));
        if (this.f305392a.getTracesSampler() != null) {
            try {
                dA2 = this.f305392a.getTracesSampler().a(s4Var);
            } catch (Throwable th3) {
                this.f305392a.getLogger().a(y7.ERROR, "Error in the 'TracesSamplerCallback' callback.", th3);
                dA2 = null;
            }
            if (dA2 != null) {
                return new fa(Boolean.valueOf(b(dA2, dC)), dA2, dC, boolValueOf, d10);
            }
        }
        fa faVarE = s4Var.d().E();
        if (faVarE != null) {
            return io.sentry.util.d0.a(faVarE);
        }
        Double tracesSampleRate = this.f305392a.getTracesSampleRate();
        Double dValueOf = tracesSampleRate != null ? Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.f305392a.getBackpressureMonitor().a())) : null;
        if (dValueOf != null) {
            return new fa(Boolean.valueOf(b(dValueOf, dC)), dValueOf, dC, boolValueOf, d10);
        }
        Boolean bool = Boolean.FALSE;
        return new fa(bool, null, dC, bool, null);
    }

    public boolean c(double d10) {
        Double profileSessionSampleRate = this.f305392a.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && b(profileSessionSampleRate, Double.valueOf(d10));
    }
}
