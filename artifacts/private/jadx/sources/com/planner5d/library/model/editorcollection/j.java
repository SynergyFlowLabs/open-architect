package com.planner5d.library.model.editorcollection;

import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
public final class j extends t implements i.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f180707d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f180708e = 0;

    public static final class a extends t.b<j> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.planner5d.library.model.editorcollection.k
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public j a(@Nullable id.a aVar) {
            return new j(aVar);
        }

        private a() {
        }
    }

    public j(@Nullable id.a aVar) {
        super("favorites", aVar);
    }

    @Override // com.planner5d.library.model.editorcollection.i
    @NotNull
    public List<g.b> a(boolean z10) {
        return d().d();
    }

    @Override // com.planner5d.library.model.editorcollection.i.a
    public void b(@NotNull g.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        d().f(value);
    }

    @Override // com.planner5d.library.model.editorcollection.i.a
    public void c(@NotNull g.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        d().b(value);
    }
}
