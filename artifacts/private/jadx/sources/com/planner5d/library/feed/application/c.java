package com.planner5d.library.feed.application;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@fg.d(modules = {d.class, f.class})
@e
public abstract class c extends com.planner5d.library.view.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f170894b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f170895c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a() {
            c cVar = c.f170895c;
            if (cVar != null) {
                return cVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            return null;
        }

        public final void b(@NotNull c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            c.f170895c = cVar;
        }

        private a() {
        }
    }

    @fg.d.b
    public interface b {
        @NotNull
        c a(@NotNull d dVar);
    }
}
