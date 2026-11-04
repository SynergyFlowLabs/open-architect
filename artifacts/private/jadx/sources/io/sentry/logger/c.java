package io.sentry.logger;

import io.sentry.a8;
import io.sentry.b8;
import io.sentry.d8;
import io.sentry.e6;
import io.sentry.g1;
import io.sentry.g5;
import io.sentry.m4;
import io.sentry.n8;
import io.sentry.p1;
import io.sentry.protocol.g0;
import io.sentry.protocol.p;
import io.sentry.protocol.v;
import io.sentry.q0;
import io.sentry.util.a0;
import io.sentry.util.o0;
import io.sentry.v5;
import io.sentry.v9;
import io.sentry.w5;
import io.sentry.x5;
import io.sentry.y7;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g5 f305848a;

    public c(@NotNull g5 g5Var) {
        this.f305848a = g5Var;
    }

    private void c(@NotNull d8 d8Var, @NotNull h hVar, @Nullable String str, @Nullable Object... objArr) {
        n8 n8VarB = this.f305848a.b();
        try {
            if (!this.f305848a.isEnabled()) {
                n8VarB.getLogger().c(y7.WARNING, "Instance is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (!n8VarB.getLogs().b()) {
                n8VarB.getLogger().c(y7.WARNING, "Sentry Log is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null) {
                return;
            }
            e6 e6VarE = hVar.e();
            if (e6VarE == null) {
                e6VarE = n8VarB.getDateProvider().a();
            }
            String strM = m(str, objArr);
            g1 g1VarN = this.f305848a.N();
            m4 m4VarC0 = g1VarN.c0();
            p1 p1VarE = g1VarN.e();
            if (p1VarE == null) {
                o0.j(g1VarN, n8VarB);
            }
            v vVarI = p1VarE == null ? m4VarC0.i() : p1VarE.m().p();
            v9 v9VarH = p1VarE == null ? m4VarC0.h() : p1VarE.m().m();
            a8 a8Var = new a8(vVarI, e6VarE, strM, d8Var);
            a8Var.g(d(hVar, str, v9VarH, objArr));
            a8Var.j(Integer.valueOf(d8Var.getSeverityNumber()));
            this.f305848a.M().g(a8Var, g1VarN);
        } catch (Throwable th2) {
            n8VarB.getLogger().a(y7.ERROR, "Error while capturing log event", th2);
        }
    }

    @NotNull
    private HashMap<String, b8> d(@NotNull h hVar, @NotNull String str, @NotNull v9 v9Var, @Nullable Object... objArr) {
        HashMap<String, b8> map = new HashMap<>();
        map.put("sentry.origin", new b8(w5.STRING, hVar.d()));
        x5 x5VarC = hVar.c();
        if (x5VarC != null) {
            for (v5 v5Var : x5VarC.c().values()) {
                Object objE = v5Var.e();
                map.put(v5Var.c(), new b8(v5Var.d() == null ? g(objE) : v5Var.d(), objE));
            }
        }
        if (objArr != null) {
            int i10 = 0;
            for (Object obj : objArr) {
                map.put("sentry.message.parameter." + i10, new b8(g(obj), obj));
                i10++;
            }
            if (i10 > 0 && map.get("sentry.message.template") == null) {
                map.put("sentry.message.template", new b8(w5.STRING, str));
            }
        }
        p sdkVersion = this.f305848a.b().getSdkVersion();
        if (sdkVersion != null) {
            w5 w5Var = w5.STRING;
            map.put("sentry.sdk.name", new b8(w5Var, sdkVersion.f()));
            map.put("sentry.sdk.version", new b8(w5Var, sdkVersion.h()));
        }
        String environment = this.f305848a.b().getEnvironment();
        if (environment != null) {
            map.put("sentry.environment", new b8(w5.STRING, environment));
        }
        v vVarT = this.f305848a.N().t();
        v vVar = v.f306474b;
        if (vVar.equals(vVarT)) {
            v vVarT2 = this.f305848a.b().getReplayController().t();
            if (!vVar.equals(vVarT2)) {
                map.put("sentry.replay_id", new b8(w5.STRING, vVarT2.toString()));
                map.put("sentry._internal.replay_is_buffering", new b8(w5.BOOLEAN, Boolean.TRUE));
            }
        } else {
            map.put("sentry.replay_id", new b8(w5.STRING, vVarT.toString()));
        }
        String release = this.f305848a.b().getRelease();
        if (release != null) {
            map.put("sentry.release", new b8(w5.STRING, release));
        }
        map.put("sentry.trace.parent_span_id", new b8(w5.STRING, v9Var));
        if (a0.c()) {
            n(map);
        }
        o(map);
        return map;
    }

    @NotNull
    private w5 g(@Nullable Object obj) {
        if (obj instanceof Boolean) {
            return w5.BOOLEAN;
        }
        if (obj instanceof Integer) {
            return w5.INTEGER;
        }
        return obj instanceof Number ? w5.DOUBLE : w5.STRING;
    }

    @NotNull
    private String m(@NotNull String str, @Nullable Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            try {
                return String.format(str, objArr);
            } catch (Throwable th2) {
                this.f305848a.b().getLogger().a(y7.ERROR, "Error while running log through String.format", th2);
            }
        }
        return str;
    }

    private void n(@NotNull HashMap<String, b8> map) {
        String strD;
        n8 n8VarB = this.f305848a.b();
        String serverName = n8VarB.getServerName();
        if (serverName != null) {
            map.put("server.address", new b8(w5.STRING, serverName));
        } else {
            if (!n8VarB.isAttachServerName() || (strD = q0.e().d()) == null) {
                return;
            }
            map.put("server.address", new b8(w5.STRING, strD));
        }
    }

    private void o(@NotNull HashMap<String, b8> map) {
        g0 g0VarG = this.f305848a.N().G();
        if (g0VarG != null) {
            String strL = g0VarG.l();
            if (strL != null) {
                map.put("user.id", new b8(w5.STRING, strL));
            }
            String strO = g0VarG.o();
            if (strO != null) {
                map.put("user.name", new b8(w5.STRING, strO));
            }
            String strJ = g0VarG.j();
            if (strJ != null) {
                map.put("user.email", new b8(w5.STRING, strJ));
            }
        }
    }

    @Override // io.sentry.logger.a
    public void a(@Nullable String str, @Nullable Object... objArr) {
        j(d8.ERROR, str, objArr);
    }

    @Override // io.sentry.logger.a
    public void b(@Nullable String str, @Nullable Object... objArr) {
        j(d8.WARN, str, objArr);
    }

    @Override // io.sentry.logger.a
    public void e(@Nullable String str, @Nullable Object... objArr) {
        j(d8.DEBUG, str, objArr);
    }

    @Override // io.sentry.logger.a
    public void f(@Nullable String str, @Nullable Object... objArr) {
        j(d8.TRACE, str, objArr);
    }

    @Override // io.sentry.logger.a
    public void h(@Nullable String str, @Nullable Object... objArr) {
        j(d8.INFO, str, objArr);
    }

    @Override // io.sentry.logger.a
    public void i(@Nullable String str, @Nullable Object... objArr) {
        j(d8.FATAL, str, objArr);
    }

    @Override // io.sentry.logger.a
    public void j(@NotNull d8 d8Var, @Nullable String str, @Nullable Object... objArr) {
        c(d8Var, h.b(null, null), str, objArr);
    }

    @Override // io.sentry.logger.a
    public void k(@NotNull d8 d8Var, @NotNull h hVar, @Nullable String str, @Nullable Object... objArr) {
        c(d8Var, hVar, str, objArr);
    }

    @Override // io.sentry.logger.a
    public void l(@NotNull d8 d8Var, @Nullable e6 e6Var, @Nullable String str, @Nullable Object... objArr) {
        c(d8Var, h.b(e6Var, null), str, objArr);
    }
}
