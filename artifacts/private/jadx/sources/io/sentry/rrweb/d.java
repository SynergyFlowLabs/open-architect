package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.util.y;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d extends io.sentry.rrweb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f306652c;

    public static final class a {
        public boolean a(@NotNull d dVar, @NotNull String str, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            if (!str.equals("source")) {
                return false;
            }
            dVar.f306652c = (b) y.c((b) y3Var.i4(iLogger, new b.a()), "");
            return true;
        }
    }

    public enum b implements k2 {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

        public static final class a implements a2<b> {
            @Override // io.sentry.a2
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
                return b.values()[y3Var.nextInt()];
            }
        }

        static {
            int i10 = 1 << 5;
        }

        @Override // io.sentry.k2
        public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
            z3Var.c(ordinal());
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306653a = "source";
    }

    /* JADX INFO: renamed from: io.sentry.rrweb.d$d, reason: collision with other inner class name */
    public static final class C2233d {
        public void a(@NotNull d dVar, @NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
            z3Var.f("source").j(iLogger, dVar.f306652c);
        }
    }

    public d(@NotNull b bVar) {
        super(io.sentry.rrweb.c.IncrementalSnapshot);
        this.f306652c = bVar;
    }

    public b k() {
        return this.f306652c;
    }

    public void l(b bVar) {
        this.f306652c = bVar;
    }
}
