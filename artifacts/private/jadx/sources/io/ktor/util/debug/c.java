package io.ktor.util.debug;

import java.lang.management.ManagementFactory;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f296577a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f0 f296578b = g0.c(new Function0() { // from class: io.ktor.util.debug.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(c.c());
        }
    });

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c() {
        boolean zV2 = false;
        try {
            zV2 = StringsKt.V2(ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), "jdwp", false, 2, null);
        } catch (Throwable unused) {
        }
        return zV2;
    }

    public final boolean b() {
        return ((Boolean) f296578b.getValue()).booleanValue();
    }
}
