package com.planner5d.library.database.model;

import androidx.annotation.m1;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.devtodev.core.data.consts.RequestParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SynchronizedModel extends Model {

    @oj.f
    @Column(name = "deleted")
    public boolean deleted;

    @oj.f
    @Column(name = "modified_locally")
    public boolean modifiedLocally;

    @oj.f
    @Column(name = RequestParams.UID)
    @Nullable
    public String uid;

    @oj.f
    @Column(name = "user_id")
    public long userId;

    @m1
    public SynchronizedModel() {
    }

    public void s() {
        this.modifiedLocally = false;
    }

    @NotNull
    public final String u() {
        return "tmpId";
    }

    @NotNull
    public String v() {
        return "id";
    }

    public final void w(@NotNull JSONObject data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        this.uid = data.getString(v());
    }

    @m1
    public SynchronizedModel(@NotNull SynchronizedModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.uid = model.uid;
        this.modifiedLocally = model.modifiedLocally;
        this.deleted = model.deleted;
    }
}
