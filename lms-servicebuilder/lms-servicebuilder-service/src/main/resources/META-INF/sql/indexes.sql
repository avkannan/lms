create index IX_C498DC2D on lms_staff (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F11489EF on lms_staff (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_52806748 on lms_student (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E60A1FCA on lms_student (uuid_[$COLUMN_LENGTH:75$], groupId);