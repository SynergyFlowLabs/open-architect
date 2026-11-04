package com.planner5d.library.services.utility;

import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class m0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f225327a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f225328b;

    protected boolean a() {
        return !this.f225328b;
    }

    protected void b() {
        this.f225328b = false;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f225327a) {
            try {
                if (a()) {
                    this.f225328b = true;
                    Unit unit = Unit.f312394a;
                    try {
                        command.run();
                        synchronized (this.f225327a) {
                            b();
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f225327a) {
                            try {
                                b();
                                Unit unit2 = Unit.f312394a;
                                throw th2;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
