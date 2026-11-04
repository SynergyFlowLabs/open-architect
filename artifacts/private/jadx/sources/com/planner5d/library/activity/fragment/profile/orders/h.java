package com.planner5d.library.activity.fragment.profile.orders;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f134760b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f134761a;

    public enum a {
        Platform(0),
        Order(1),
        Spacer(2);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f134766f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f134767a;

        a(int i10) {
            this.f134767a = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f134766f;
        }

        public final int n() {
            return this.f134767a;
        }
    }

    public h(@NotNull a viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f134761a = viewType;
    }

    @NotNull
    public final a a() {
        return this.f134761a;
    }
}
