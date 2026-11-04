package com.activeandroid.query;

import androidx.annotation.m1;
import com.activeandroid.Cache;
import com.activeandroid.Model;

/* JADX INFO: loaded from: classes3.dex */
public final class Update implements Sqlable {
    private final Class<? extends Model> mType;

    public Update(Class<? extends Model> cls) {
        this.mType = cls;
    }

    Class<? extends Model> getType() {
        return this.mType;
    }

    public Set set(String str) {
        return new Set(this, str);
    }

    @Override // com.activeandroid.query.Sqlable
    @m1
    public String toSql() {
        return "UPDATE " + Cache.getTableName(this.mType) + " ";
    }

    public Set set(String str, Object... objArr) {
        return new Set(this, str, objArr);
    }
}
