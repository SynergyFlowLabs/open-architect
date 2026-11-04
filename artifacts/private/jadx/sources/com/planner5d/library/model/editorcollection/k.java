package com.planner5d.library.model.editorcollection;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.editorcollection.i;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nStorageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageHolder.kt\ncom/planner5d/library/model/editorcollection/StorageHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public abstract class k<S extends i, Key> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f180709c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private S f180710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f180711b = new Object();

    @NotNull
    public abstract S a(Key key);

    @NotNull
    public final S b(Key key) {
        S s10;
        synchronized (this.f180711b) {
            try {
                s10 = this.f180710a;
                if (s10 == null || !c(s10, key)) {
                    s10 = (S) a(key);
                }
                this.f180710a = s10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s10;
    }

    public abstract boolean c(@NotNull S s10, Key key);
}
