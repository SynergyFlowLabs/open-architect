package com.devtodev.analytics.internal.backend.repository;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class BackendUserDataErrorWithResponse extends BackendUserData {

    @Nullable
    private final String message;
    private final int response;

    public BackendUserDataErrorWithResponse(int i10, @Nullable String str) {
        super(null);
        this.response = i10;
        this.message = str;
    }

    public static /* synthetic */ BackendUserDataErrorWithResponse copy$default(BackendUserDataErrorWithResponse backendUserDataErrorWithResponse, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = backendUserDataErrorWithResponse.response;
        }
        if ((i11 & 2) != 0) {
            str = backendUserDataErrorWithResponse.message;
        }
        return backendUserDataErrorWithResponse.copy(i10, str);
    }

    public final int component1() {
        return this.response;
    }

    @Nullable
    public final String component2() {
        return this.message;
    }

    @NotNull
    public final BackendUserDataErrorWithResponse copy(int i10, @Nullable String str) {
        return new BackendUserDataErrorWithResponse(i10, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackendUserDataErrorWithResponse)) {
            return false;
        }
        BackendUserDataErrorWithResponse backendUserDataErrorWithResponse = (BackendUserDataErrorWithResponse) obj;
        if (this.response == backendUserDataErrorWithResponse.response && Intrinsics.areEqual(this.message, backendUserDataErrorWithResponse.message)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final int getResponse() {
        return this.response;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.response) * 31;
        String str = this.message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "BackendUserDataErrorWithResponse(response=" + this.response + ", message=" + this.message + ")";
    }
}
