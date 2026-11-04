package com.planner5d.library.model.manager.builtin.materialsmetadataloading;

import android.app.Application;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.builtin.e1;
import com.planner5d.library.model.p;
import com.planner5d.library.model.r;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.i1;
import com.planner5d.library.services.z;
import java.io.InputStream;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class d extends f<Map<String, ? extends p>> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f181130j = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final r f181131i;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f181132g = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Application f181133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.services.bitmaploader.d.g f181134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final c2 f181135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final i1 f181136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final z f181137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final r f181138f;

        @ij.a
        public a(@NotNull Application application, @NotNull com.planner5d.library.services.bitmaploader.d.g uriLoader, @NotNull c2 networkStateUtility, @NotNull i1 internetStateMonitor, @NotNull z privateFiles, @NotNull r materialInfoParser) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(uriLoader, "uriLoader");
            Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
            Intrinsics.checkNotNullParameter(internetStateMonitor, "internetStateMonitor");
            Intrinsics.checkNotNullParameter(privateFiles, "privateFiles");
            Intrinsics.checkNotNullParameter(materialInfoParser, "materialInfoParser");
            this.f181133a = application;
            this.f181134b = uriLoader;
            this.f181135c = networkStateUtility;
            this.f181136d = internetStateMonitor;
            this.f181137e = privateFiles;
            this.f181138f = materialInfoParser;
        }

        @NotNull
        public final d a(@NotNull e1 materialFilePaths) {
            Intrinsics.checkNotNullParameter(materialFilePaths, "materialFilePaths");
            return new d(this.f181133a, this.f181134b, materialFilePaths, com.planner5d.library.model.manager.builtin.materialsmetadataloading.a.f181104a.b(), this.f181135c, this.f181136d, this.f181137e, this.f181138f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Application application, @NotNull com.planner5d.library.services.bitmaploader.d.g uriLoader, @NotNull e1 materialFilePaths, @NotNull g dataPaths, @NotNull c2 networkStateUtility, @NotNull i1 internetStateMonitor, @NotNull z privateFiles, @NotNull r materialInfoParser) {
        super(application, uriLoader, materialFilePaths, dataPaths, networkStateUtility, internetStateMonitor, privateFiles);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(uriLoader, "uriLoader");
        Intrinsics.checkNotNullParameter(materialFilePaths, "materialFilePaths");
        Intrinsics.checkNotNullParameter(dataPaths, "dataPaths");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(internetStateMonitor, "internetStateMonitor");
        Intrinsics.checkNotNullParameter(privateFiles, "privateFiles");
        Intrinsics.checkNotNullParameter(materialInfoParser, "materialInfoParser");
        this.f181131i = materialInfoParser;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.model.manager.builtin.materialsmetadataloading.f
    @m1
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map<String, p> f(@Nullable InputStream inputStream) throws Exception {
        return inputStream != null ? (Map) this.f181131i.b(inputStream) : MapsKt.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.model.manager.builtin.materialsmetadataloading.f
    @m1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Map<String, p> h(@NotNull InputStream inputStream) throws Throwable {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return (Map) this.f181131i.b(inputStream);
    }
}
