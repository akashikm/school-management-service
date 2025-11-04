CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE public.student (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    created_date TIMESTAMP DEFAULT now() NOT NULL
);
