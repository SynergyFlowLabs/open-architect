package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(24)
final class oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f31381a = new a(null);

    @SourceDebugExtension({"SMAP\nCalendarLocale.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarLocale.android.kt\nandroidx/compose/material3/Locale24$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,49:1\n75#2:50\n*S KotlinDebug\n*F\n+ 1 CalendarLocale.android.kt\nandroidx/compose/material3/Locale24$Companion\n*L\n45#1:50\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.p4
        @NotNull
        public final Locale a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(317587697, i10, -1, "androidx.compose.material3.Locale24.Companion.defaultLocale (CalendarLocale.android.kt:43)");
            }
            Locale locale = ((Configuration) c0Var.W(AndroidCompositionLocals_androidKt.f())).getLocales().get(0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return locale;
        }

        private a() {
        }
    }
}
