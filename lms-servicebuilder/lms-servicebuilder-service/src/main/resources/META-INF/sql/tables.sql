create table lms_author (
	uuid_ VARCHAR(75) null,
	authorID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	displayName VARCHAR(75) null,
	salutation VARCHAR(75) null
);

create table lms_book (
	uuid_ VARCHAR(75) null,
	bookID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	authorID LONG,
	publicationID LONG,
	edition VARCHAR(75) null,
	title INTEGER,
	quantity INTEGER
);

create table lms_lending (
	uuid_ VARCHAR(75) null,
	lendingID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	bookTitle LONG,
	bookId LONG,
	studentId LONG,
	staffId LONG,
	dueDate DATE null,
	lateFee DOUBLE,
	checkoutDate DATE null,
	loanPeriod LONG,
	checkinDate DATE null
);

create table lms_lookup (
	uuid_ VARCHAR(75) null,
	lookupID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	lookupKey VARCHAR(75) null,
	lookupValue VARCHAR(75) null,
	lookupName INTEGER
);

create table lms_publication (
	uuid_ VARCHAR(75) null,
	publicationID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	publicationName VARCHAR(75) null,
	addressLine1 VARCHAR(75) null,
	addressLine2 VARCHAR(75) null,
	city VARCHAR(75) null,
	zip VARCHAR(75) null,
	state_ VARCHAR(75) null,
	country VARCHAR(75) null
);

create table lms_staff (
	uuid_ VARCHAR(75) null,
	staffID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	displayName VARCHAR(75) null,
	salutation VARCHAR(75) null,
	departmentID VARCHAR(75) null,
	staffType VARCHAR(75) null,
	designation VARCHAR(75) null,
	expertise VARCHAR(75) null,
	qualifcation VARCHAR(75) null,
	experience LONG
);

create table lms_student (
	uuid_ VARCHAR(75) null,
	studentID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	displayName VARCHAR(75) null,
	salutation VARCHAR(75) null,
	departmentID VARCHAR(75) null,
	batch VARCHAR(75) null,
	duration LONG,
	registrationNo LONG
);