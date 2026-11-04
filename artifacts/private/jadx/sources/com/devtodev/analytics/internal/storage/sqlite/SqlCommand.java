package com.devtodev.analytics.internal.storage.sqlite;

import android.database.Cursor;
import com.devtodev.analytics.internal.storage.EventParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SqlCommand {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nSqlCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlCommand.kt\ncom/devtodev/analytics/internal/storage/sqlite/SqlCommand$Companion\n+ 2 Cursor.kt\nandroidx/core/database/CursorKt\n*L\n1#1,224:1\n73#2:225\n86#2:226\n47#2:227\n112#2:228\n*S KotlinDebug\n*F\n+ 1 SqlCommand.kt\ncom/devtodev/analytics/internal/storage/sqlite/SqlCommand$Companion\n*L\n161#1:225\n177#1:226\n204#1:227\n220#1:228\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void addNumber(EventParam eventParam, StringBuilder sb2, List<String> list, RemoverPattern removerPattern) {
            if (sb2.length() > 0) {
                sb2.append(" and ");
            }
            sb2.append(eventParam.getName() + removerPattern.getValue());
            SqlValue value = eventParam.getValue();
            if (value instanceof SqlValue.Int) {
                SqlValue value2 = eventParam.getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Int");
                list.add(String.valueOf(((SqlValue.Int) value2).getAnInt()));
            } else if (value instanceof SqlValue.Long) {
                SqlValue value3 = eventParam.getValue();
                Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
                list.add(String.valueOf(((SqlValue.Long) value3).getALong()));
            } else if (value instanceof SqlValue.Double) {
                SqlValue value4 = eventParam.getValue();
                Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Double");
                list.add(String.valueOf(((SqlValue.Double) value4).getADouble()));
            }
        }

        private final EventParam getBoolean(Cursor cursor, String str) {
            return new EventParam(str, new SqlValue.Boolean(cursor.getInt(cursor.getColumnIndex(str)) == 1));
        }

        private final EventParam getDouble(Cursor cursor, String str) {
            return new EventParam(str, new SqlValue.Double(cursor.getDouble(cursor.getColumnIndex(str))));
        }

        private final EventParam getDoubleOrNull(Cursor cursor, String str) {
            int columnIndex = cursor.getColumnIndex(str);
            return new EventParam(str, new SqlValue.DoubleOrNull(cursor.isNull(columnIndex) ? null : Double.valueOf(cursor.getDouble(columnIndex))));
        }

        private final EventParam getInt(Cursor cursor, String str) {
            return new EventParam(str, new SqlValue.Int(cursor.getInt(cursor.getColumnIndex(str))));
        }

        private final EventParam getIntOrNull(Cursor cursor, String str) {
            int columnIndex = cursor.getColumnIndex(str);
            return new EventParam(str, new SqlValue.IntOrNull(cursor.isNull(columnIndex) ? null : Integer.valueOf(cursor.getInt(columnIndex))));
        }

        private final EventParam getLong(Cursor cursor, String str) {
            return new EventParam(str, new SqlValue.Long(cursor.getLong(cursor.getColumnIndex(str))));
        }

        private final EventParam getLongOrNull(Cursor cursor, String str) {
            int columnIndex = cursor.getColumnIndex(str);
            return new EventParam(str, new SqlValue.LongOrNull(cursor.isNull(columnIndex) ? null : Long.valueOf(cursor.getLong(columnIndex))));
        }

        private final EventParam getString(Cursor cursor, String str) {
            String string = cursor.getString(cursor.getColumnIndex(str));
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(columnIndex)");
            return new EventParam(str, new SqlValue.String(string));
        }

        private final EventParam getStringOrNull(Cursor cursor, String str) {
            int columnIndex = cursor.getColumnIndex(str);
            return new EventParam(str, new SqlValue.StringOrNull(cursor.isNull(columnIndex) ? null : cursor.getString(columnIndex)));
        }

        @Nullable
        public final String createSelection$DTDAnalytics_androidRelease(@NotNull List<EventParam> list) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            if (list.isEmpty()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (EventParam eventParam : list) {
                if (sb2.length() > 0) {
                    sb2.append(" and ");
                }
                sb2.append(eventParam.getName() + " = ?");
            }
            return sb2.toString();
        }

        @NotNull
        public final List<EventParam> getRecord$DTDAnalytics_androidRelease(@NotNull Cursor cursor, @NotNull List<SelectParameter> columns) {
            EventParam stringOrNull;
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(columns, "columns");
            ArrayList arrayList = new ArrayList();
            for (SelectParameter selectParameter : columns) {
                ColumnType columnType = selectParameter.getColumnType();
                if (columnType instanceof ColumnTypeInt) {
                    stringOrNull = getInt(cursor, selectParameter.getColumnName());
                } else if (columnType instanceof ColumnTypeLong) {
                    stringOrNull = getLong(cursor, selectParameter.getColumnName());
                } else if (columnType instanceof ColumnTypeBoolean) {
                    stringOrNull = getBoolean(cursor, selectParameter.getColumnName());
                } else if (columnType instanceof ColumnTypeDouble) {
                    stringOrNull = getDouble(cursor, selectParameter.getColumnName());
                } else if (columnType instanceof ColumnTypeString) {
                    stringOrNull = getString(cursor, selectParameter.getColumnName());
                } else if (columnType instanceof ColumnTypeIntOrNull) {
                    stringOrNull = getIntOrNull(cursor, selectParameter.getColumnName());
                } else if (columnType instanceof ColumnTypeLongOrNull) {
                    stringOrNull = getLongOrNull(cursor, selectParameter.getColumnName());
                } else if (columnType instanceof ColumnTypeDoubleOrNull) {
                    stringOrNull = getDoubleOrNull(cursor, selectParameter.getColumnName());
                } else {
                    if (!(columnType instanceof ColumnTypeStringOrNull)) {
                        throw new k0();
                    }
                    stringOrNull = getStringOrNull(cursor, selectParameter.getColumnName());
                }
                arrayList.add(stringOrNull);
            }
            return arrayList;
        }

        public final void parseWhereParameter$DTDAnalytics_androidRelease(@NotNull EventParam param, @NotNull StringBuilder selectionBuilder, @NotNull List<String> selectionArgsList, @NotNull RemoverPattern removerPattern) {
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(selectionBuilder, "selectionBuilder");
            Intrinsics.checkNotNullParameter(selectionArgsList, "selectionArgsList");
            Intrinsics.checkNotNullParameter(removerPattern, "removerPattern");
            SqlValue value = param.getValue();
            if (value instanceof SqlValue.Int) {
                addNumber(param, selectionBuilder, selectionArgsList, removerPattern);
                return;
            }
            if (value instanceof SqlValue.Long) {
                addNumber(param, selectionBuilder, selectionArgsList, removerPattern);
                return;
            }
            if (value instanceof SqlValue.Double) {
                addNumber(param, selectionBuilder, selectionArgsList, removerPattern);
                return;
            }
            if (value instanceof SqlValue.Boolean) {
                if (selectionBuilder.length() > 0) {
                    selectionBuilder.append(" and ");
                }
                selectionBuilder.append(param.getName() + removerPattern.getValue());
                SqlValue value2 = param.getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
                selectionArgsList.add(String.valueOf(((SqlValue.Boolean) value2).getABoolean() ? 1 : 0));
                return;
            }
            if (value instanceof SqlValue.StringOrNull) {
                if (selectionBuilder.length() > 0) {
                    selectionBuilder.append(" and ");
                }
                if (StringsKt.V2(selectionBuilder, "LIKE", false, 2, null)) {
                    selectionBuilder.append(param.getName() + removerPattern.getValue());
                } else {
                    selectionBuilder.append(param.getName() + " LIKE ?");
                }
                SqlValue value3 = param.getValue();
                Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
                selectionArgsList.add(((SqlValue.StringOrNull) value3).getString());
                return;
            }
            if (value instanceof SqlValue.String) {
                if (selectionBuilder.length() > 0) {
                    selectionBuilder.append(" and ");
                }
                if (StringsKt.V2(selectionBuilder, "LIKE", false, 2, null)) {
                    selectionBuilder.append(param.getName() + removerPattern.getValue());
                } else {
                    selectionBuilder.append(param.getName() + " LIKE ?");
                }
                SqlValue value4 = param.getValue();
                Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
                selectionArgsList.add(((SqlValue.String) value4).getString());
            }
        }

        private Companion() {
        }
    }
}
