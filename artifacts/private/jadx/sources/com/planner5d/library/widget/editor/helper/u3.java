package com.planner5d.library.widget.editor.helper;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProjectLoadInfoCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectLoadInfoCache.kt\ncom/planner5d/library/widget/editor/helper/ProjectLoadInfoCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
public final class u3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f256802c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<s3, t3> f256803a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private s3 f256804b;

    private final t3 b(s3 s3Var) {
        t3 t3Var;
        synchronized (this.f256803a) {
            s3 s3VarD = d(s3Var);
            t3Var = s3VarD != null ? this.f256803a.get(s3VarD) : null;
        }
        return t3Var;
    }

    private final s3 d(s3 s3Var) {
        for (s3 s3Var2 : this.f256803a.keySet()) {
            if (f(s3Var2, s3Var)) {
                return s3Var2;
            }
        }
        return null;
    }

    private final boolean f(s3 s3Var, s3 s3Var2) {
        return (s3Var.b() != null && Intrinsics.areEqual(s3Var.b(), s3Var2.b())) || (s3Var.e() != null && Intrinsics.areEqual(s3Var.e(), s3Var2.e())) || ((s3Var.f() != null && s3Var.f().length() > 0 && Intrinsics.areEqual(s3Var.f(), s3Var2.f())) || ((s3Var.d() != null && Intrinsics.areEqual(s3Var.d(), s3Var2.d())) || (s3Var.b() == null && s3Var.e() == null && s3Var2.b() == null && s3Var2.e() == null && s3Var.f() == null && s3Var2.f() == null && s3Var.d() == null && s3Var2.d() == null)));
    }

    public final void a() {
        synchronized (this.f256803a) {
            this.f256803a.clear();
            this.f256804b = null;
            Unit unit = Unit.f312394a;
        }
    }

    @Nullable
    public final t3 c() {
        t3 t3VarB;
        synchronized (this.f256803a) {
            try {
                s3 s3Var = this.f256804b;
                t3VarB = s3Var != null ? b(s3Var) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t3VarB;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0019  */
    public final boolean e(@Nullable s3 s3Var) {
        boolean z10;
        synchronized (this.f256803a) {
            if (s3Var != null) {
                try {
                    s3 s3Var2 = this.f256804b;
                    if (s3Var2 != null) {
                        boolean zF = f(s3Var, s3Var2);
                        z10 = true;
                        if (!zF) {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @NotNull
    public final t3 g(@NotNull s3 id2, @NotNull t3 info) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(info, "info");
        synchronized (this.f256803a) {
            try {
                Iterator<s3> it = this.f256803a.keySet().iterator();
                Long lB = id2.b();
                String strE = id2.e();
                Long lC = id2.c();
                Long lD = id2.d();
                while (it.hasNext()) {
                    s3 next = it.next();
                    if (f(next, id2)) {
                        if (lB == null && next.b() != null) {
                            lB = next.b();
                        }
                        if (strE == null && next.e() != null) {
                            strE = next.e();
                        }
                        if (lC == null) {
                            lC = next.c();
                        }
                        if (lD == null) {
                            lD = next.d();
                        }
                        it.remove();
                    }
                }
                this.f256803a.put(new s3(lB, strE, lC, lD), info);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return info;
    }

    @NotNull
    public final t3 h(@NotNull t3 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return g(new s3(info.b()), info);
    }

    @Nullable
    public final t3 i(@NotNull s3 id2) {
        t3 t3VarC;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f256803a) {
            try {
                this.f256804b = id2;
                t3VarC = c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t3VarC;
    }
}
