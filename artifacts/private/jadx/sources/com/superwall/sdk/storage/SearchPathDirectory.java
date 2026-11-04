package com.superwall.sdk.storage;

import android.content.Context;
import java.io.File;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum SearchPathDirectory {
    CACHE,
    USER_SPECIFIC_DOCUMENTS,
    APP_SPECIFIC_DOCUMENTS;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchPathDirectory.values().length];
            try {
                iArr[SearchPathDirectory.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchPathDirectory.USER_SPECIFIC_DOCUMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchPathDirectory.APP_SPECIFIC_DOCUMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static a<SearchPathDirectory> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final File fileDirectory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
            return cacheDir;
        }
        if (i10 == 2) {
            File dir = context.getDir("user_specific_document_dir", 0);
            Intrinsics.checkNotNullExpressionValue(dir, "getDir(...)");
            return dir;
        }
        if (i10 != 3) {
            throw new k0();
        }
        File dir2 = context.getDir("app_specific_document_dir", 0);
        Intrinsics.checkNotNullExpressionValue(dir2, "getDir(...)");
        return dir2;
    }
}
