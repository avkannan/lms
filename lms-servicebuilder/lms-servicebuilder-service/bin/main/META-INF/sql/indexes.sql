create index IX_C69F8792 on lms_author (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_2728CA94 on lms_author (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_2FAC3530 on lms_book (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F02047B2 on lms_book (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8D3CE5A0 on lms_lending (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3E025422 on lms_lending (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C251C201 on lms_lookup (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_95B4D4C3 on lms_lookup (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_1710C339 on lms_publication (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1232C3FB on lms_publication (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C498DC2D on lms_staff (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F11489EF on lms_staff (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_52806748 on lms_student (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E60A1FCA on lms_student (uuid_[$COLUMN_LENGTH:75$], groupId);