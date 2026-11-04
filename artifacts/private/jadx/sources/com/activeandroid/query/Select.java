package com.activeandroid.query;

import android.text.TextUtils;
import com.activeandroid.Model;

/* JADX INFO: loaded from: classes3.dex */
public final class Select implements Sqlable {
    private String[] mColumns;
    private boolean mDistinct = false;
    private boolean mAll = false;

    public static class Column {
        String alias;
        String name;

        public Column(String str, String str2) {
            this.name = str;
            this.alias = str2;
        }
    }

    public Select() {
    }

    public Select all() {
        this.mDistinct = false;
        this.mAll = true;
        return this;
    }

    public Select distinct() {
        this.mDistinct = true;
        this.mAll = false;
        return this;
    }

    public From from(Class<? extends Model> cls) {
        return new From(cls, this);
    }

    @Override // com.activeandroid.query.Sqlable
    public String toSql() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        if (this.mDistinct) {
            sb2.append("DISTINCT ");
        } else if (this.mAll) {
            sb2.append("ALL ");
        }
        String[] strArr = this.mColumns;
        if (strArr == null || strArr.length <= 0) {
            sb2.append("* ");
        } else {
            sb2.append(TextUtils.join(", ", this.mColumns) + " ");
        }
        return sb2.toString();
    }

    public Select(String... strArr) {
        this.mColumns = strArr;
    }

    public Select(Column... columnArr) {
        int length = columnArr.length;
        this.mColumns = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.mColumns[i10] = columnArr[i10].name + " AS " + columnArr[i10].alias;
        }
    }
}
