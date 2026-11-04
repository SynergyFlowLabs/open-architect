package com.planner5d.library.userimporteddata;

import android.app.Application;
import androidx.annotation.m1;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.g3;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@ij.f
@SourceDebugExtension({"SMAP\nUserImportedMetadataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserImportedMetadataRepository.kt\ncom/planner5d/library/userimporteddata/UserImportedMetadataRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final a f235809h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f235810i = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f235811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f235812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c2 f235813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final g f235814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final b f235815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final g3 f235816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final u1 f235817g;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @ij.a
    public i(@NotNull Application application, @NotNull n nameProcessor, @NotNull c2 networkStateUtility, @NotNull g remoteMetadata, @NotNull b localMetadata, @NotNull g3 timeProvider, @NotNull u1 logRecordManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(nameProcessor, "nameProcessor");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(remoteMetadata, "remoteMetadata");
        Intrinsics.checkNotNullParameter(localMetadata, "localMetadata");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f235811a = application;
        this.f235812b = nameProcessor;
        this.f235813c = networkStateUtility;
        this.f235814d = remoteMetadata;
        this.f235815e = localMetadata;
        this.f235816f = timeProvider;
        this.f235817g = logRecordManager;
    }

    @m1
    private final p a(String str, d dVar) {
        List<p> listA;
        Object next;
        p pVar = null;
        try {
            listA = this.f235815e.a(str);
        } catch (Exception unused) {
            listA = null;
        }
        if (listA != null) {
            Iterator<T> it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((p) next).b() != dVar);
            p pVar2 = (p) next;
            if (pVar2 != null && d(pVar2)) {
                pVar = pVar2;
            }
        }
        return pVar;
    }

    @m1
    private final List<p> c(String str) {
        if (!this.f235813c.d(this.f235811a)) {
            return null;
        }
        try {
            return this.f235814d.a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private final boolean d(p pVar) {
        return this.f235816f.currentTimeMillis() - pVar.d() <= f235810i;
    }

    @Nullable
    public final p b(@Nullable String str, @NotNull d targetFormat) {
        Object next;
        Intrinsics.checkNotNullParameter(targetFormat, "targetFormat");
        String strA = this.f235812b.a(str);
        if (strA == null) {
            return null;
        }
        p pVarA = a(strA, targetFormat);
        if (pVarA == null) {
            List<p> listC = c(strA);
            if (listC != null) {
                this.f235815e.c(listC);
                Iterator<T> it = listC.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((p) next).b() != targetFormat);
                pVarA = (p) next;
            } else {
                pVarA = null;
            }
        }
        if (pVarA == null) {
            this.f235817g.b("failed_to_fetch_user_model_metadata", str + " " + targetFormat.name(), null);
        }
        return pVarA;
    }
}
