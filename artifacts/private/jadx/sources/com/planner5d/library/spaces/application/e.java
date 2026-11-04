package com.planner5d.library.spaces.application;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@fg.d(modules = {f.class, v.class})
@w0(parameters = 1)
@u
public abstract class e extends com.planner5d.library.view.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f229982b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f229983c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e f229984d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final e a() {
            e eVar = e.f229984d;
            if (eVar != null) {
                return eVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            return null;
        }

        public final void b(@NotNull e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            e.f229984d = eVar;
        }

        private a() {
        }
    }

    @fg.d.b
    public interface b {
        @NotNull
        e a(@NotNull f fVar);
    }
}
