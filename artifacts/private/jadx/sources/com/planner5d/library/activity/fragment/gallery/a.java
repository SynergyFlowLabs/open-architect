package com.planner5d.library.activity.fragment.gallery;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.gallery.a$a, reason: collision with other inner class name */
    public enum EnumC1468a {
        CATEGORY,
        SORTING;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f133743d = kotlin.enums.c.c(k());

        static {
            int i10 = 4 & 0;
        }

        @NotNull
        public static kotlin.enums.a<EnumC1468a> l() {
            return f133743d;
        }
    }

    void applyFiltering(@NotNull EnumC1468a enumC1468a, @Nullable String str);

    @NotNull
    com.planner5d.library.model.manager.q0.d getListFilter();
}
