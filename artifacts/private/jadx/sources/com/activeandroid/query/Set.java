package com.activeandroid.query;

import androidx.annotation.m1;
import com.activeandroid.util.SQLiteUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Set implements Sqlable {
    private String mSet;
    private Update mUpdate;
    private String mWhere;
    private List<Object> mSetArguments = new ArrayList();
    private List<Object> mWhereArguments = new ArrayList();

    public Set(Update update, String str) {
        this.mUpdate = update;
        this.mSet = str;
    }

    @m1
    public void execute() {
        SQLiteUtils.execSql(toSql(), getArguments());
    }

    public String[] getArguments() {
        int size = this.mSetArguments.size();
        int size2 = this.mWhereArguments.size();
        String[] strArr = new String[size + size2];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = this.mSetArguments.get(i10).toString();
        }
        for (int i11 = 0; i11 < size2; i11++) {
            strArr[i11 + size] = this.mWhereArguments.get(i11).toString();
        }
        return strArr;
    }

    @Override // com.activeandroid.query.Sqlable
    @m1
    public String toSql() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mUpdate.toSql());
        sb2.append("SET ");
        sb2.append(this.mSet);
        sb2.append(" ");
        if (this.mWhere != null) {
            sb2.append("WHERE ");
            sb2.append(this.mWhere);
            sb2.append(" ");
        }
        return sb2.toString();
    }

    public Set where(String str) {
        this.mWhere = str;
        this.mWhereArguments.clear();
        return this;
    }

    public Set where(String str, Object... objArr) {
        this.mWhere = str;
        this.mWhereArguments.clear();
        this.mWhereArguments.addAll(Arrays.asList(objArr));
        return this;
    }

    public Set(Update update, String str, Object... objArr) {
        this.mUpdate = update;
        this.mSet = str;
        this.mSetArguments.addAll(Arrays.asList(objArr));
    }
}
