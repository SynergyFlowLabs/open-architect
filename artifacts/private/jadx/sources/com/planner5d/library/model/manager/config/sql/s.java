package com.planner5d.library.model.manager.config.sql;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements com.planner5d.library.model.manager.config.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l f190881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<Runnable> f190882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f190883c;

    public s(@NotNull l manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f190881a = manager;
        this.f190882b = new LinkedHashSet();
        this.f190883c = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(s sVar) {
        Iterator<Runnable> it = sVar.f190882b.iterator();
        while (it.hasNext()) {
            it.next().run();
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(s sVar, String str) {
        sVar.f190881a.B(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(s sVar, String str, String str2) {
        sVar.f190881a.B(str, str2);
    }

    @Override // com.planner5d.library.model.manager.config.q
    @kotlin.l(message = "use the one with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void a(@NotNull final String keyName, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        synchronized (this.f190883c) {
            try {
                this.f190882b.add(new Runnable() { // from class: com.planner5d.library.model.manager.config.sql.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.h(this.f190875a, keyName, str);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.config.q
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "commit()", imports = {}))
    public void b() {
        synchronized (this.f190883c) {
            this.f190881a.j0(new Runnable() { // from class: com.planner5d.library.model.manager.config.sql.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.f(this.f190880a);
                }
            });
            Unit unit = Unit.f312394a;
        }
    }

    @Override // com.planner5d.library.model.manager.config.q
    @kotlin.l(message = "use the one with a typed key", replaceWith = @b1(expression = "remove()", imports = {}))
    public void remove(@NotNull final String keyName) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        synchronized (this.f190883c) {
            this.f190882b.add(new Runnable() { // from class: com.planner5d.library.model.manager.config.sql.q
                @Override // java.lang.Runnable
                public final void run() {
                    s.g(this.f190878a, keyName);
                }
            });
        }
    }
}
